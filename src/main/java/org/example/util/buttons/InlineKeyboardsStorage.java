package org.example.util.buttons;

import org.example.db.entities.ProductType;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class InlineKeyboardsStorage {
    public static InlineKeyboardMarkup getMainMenuKeyboard() {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row = null;
        InlineKeyboardButton button = null;

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.MainMenu_ShowMenu.getTitle());
        button.setCallbackData(InlineButtonsStorage.MainMenu_ShowMenu.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.MainMenu_ShowBasket.getTitle());
        button.setCallbackData(InlineButtonsStorage.MainMenu_ShowBasket.getCallBackData());
        row.add(button);
        keyboard.add(row);

        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.MainMenu_ShowPersonalAccount.getTitle());
        button.setCallbackData(InlineButtonsStorage.MainMenu_ShowPersonalAccount.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }

    public static InlineKeyboardMarkup getProductTypesMenuKeyboard(ArrayList<ProductType> productTypes) {
        List<List<InlineKeyboardButton>> keyboard = new ArrayList<>();

        List<InlineKeyboardButton> row = null;
        InlineKeyboardButton button = null;

        for (int i = 0; i < productTypes.size(); i++) {
            ProductType currentProductType = productTypes.get(i);

            row = new ArrayList<>();
            button = new InlineKeyboardButton();
            button.setText(currentProductType.getName());
            button.setCallbackData("currentProductType" + currentProductType.getId());
            row.add(button);
            keyboard.add(row);
        }


        row = new ArrayList<>();
        button = new InlineKeyboardButton();
        button.setText(InlineButtonsStorage.ProductTypesMenu_GotoPreviousMenu.getTitle());
        button.setCallbackData(InlineButtonsStorage.ProductTypesMenu_GotoPreviousMenu.getCallBackData());
        row.add(button);
        keyboard.add(row);

        InlineKeyboardMarkup inlineKeyboardMarkup = new InlineKeyboardMarkup();
        inlineKeyboardMarkup.setKeyboard(keyboard);

        return inlineKeyboardMarkup;
    }
}
