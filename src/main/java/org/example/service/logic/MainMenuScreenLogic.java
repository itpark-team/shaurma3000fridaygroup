package org.example.service.logic;

import org.example.statemachine.State;
import org.example.statemachine.TransmittedData;
import org.example.util.buttons.InlineKeyboardsStorage;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

public class MainMenuScreenLogic {
    public SendMessage processWaitingCommandStart(String textFromUser, TransmittedData transmittedData) throws Exception {
        SendMessage messageToUser = new SendMessage();
        messageToUser.setChatId(transmittedData.getChatId());

        if (textFromUser.equals("/start") == false) {
            messageToUser.setText("Ошибка запуска бота. Для старта пожалуйста введите /start");
            return messageToUser;
        }

        messageToUser.setText("Выберите пункт меню");
        messageToUser.setReplyMarkup(InlineKeyboardsStorage.getMainMenuKeyboard());

        //transmittedData.setState(State.WaitingShowOrAddAuthors);

        return messageToUser;
    }
}
