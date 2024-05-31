package org.example.service.logic;

import org.example.db.entities.ProductType;
import org.example.db.repositories.ProductTypesRepository;
import org.example.statemachine.State;
import org.example.statemachine.TransmittedData;
import org.example.util.buttons.InlineButtonsStorage;
import org.example.util.buttons.InlineKeyboardsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.ArrayList;

public class MainMenuScreenLogic {

    private ProductTypesRepository productTypesRepository;

    public MainMenuScreenLogic() {
        productTypesRepository = new ProductTypesRepository();
    }

    public SendMessage processWaitingCommandStart(String textFromUser, TransmittedData transmittedData) throws Exception {
        SendMessage messageToUser = new SendMessage();
        messageToUser.setChatId(transmittedData.getChatId());

        if (textFromUser.equals("/start") == false) {
            messageToUser.setText("Ошибка запуска бота. Для старта пожалуйста введите /start");
            return messageToUser;
        }

        messageToUser.setText("Выберите пункт меню");
        messageToUser.setReplyMarkup(InlineKeyboardsStorage.getMainMenuKeyboard());

        transmittedData.setState(State.WaitingButtonClickInMainMenu);

        return messageToUser;
    }

    public SendMessage processWaitingButtonClickInMainMenu(String textFromUser, TransmittedData transmittedData) throws Exception {
        SendMessage messageToUser = new SendMessage();
        messageToUser.setChatId(transmittedData.getChatId());


        if (textFromUser.equals(InlineButtonsStorage.MainMenu_ShowMenu.getCallBackData()) == false && textFromUser.equals(InlineButtonsStorage.MainMenu_ShowBasket.getCallBackData()) == false && textFromUser.equals(InlineButtonsStorage.MainMenu_ShowPersonalAccount.getCallBackData()) == false) {
            messageToUser.setText("Ошибка. Нажмите на кнопку.");
            return messageToUser;
        }


        if (textFromUser.equals(InlineButtonsStorage.MainMenu_ShowMenu.getCallBackData()) == true) {
            messageToUser.setText("Выберите пункт меню");

            ArrayList<ProductType> productTypes = productTypesRepository.getAll();

            messageToUser.setReplyMarkup(InlineKeyboardsStorage.getProductTypesMenuKeyboard(productTypes));

            return messageToUser;
        } else if (textFromUser.equals(InlineButtonsStorage.MainMenu_ShowBasket.getCallBackData()) == true) {

        } else if (textFromUser.equals(InlineButtonsStorage.MainMenu_ShowPersonalAccount.getCallBackData()) == true) {

        }

        //transmittedData.setState(State.WaitingButtonClickInMainMenu);

        return messageToUser;
    }
}
