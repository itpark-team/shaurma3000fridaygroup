package org.example.service;

import org.example.service.logic.MainMenuScreenLogic;
import org.example.statemachine.State;
import org.example.statemachine.TransmittedData;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;

import java.util.HashMap;
import java.util.Map;

public class ServiceManager {
    private Map<String, Service> methods;

    private MainMenuScreenLogic mainMenuScreenLogic;

    public ServiceManager() {
        methods = new HashMap<>();

        mainMenuScreenLogic = new MainMenuScreenLogic();

        methods.put(State.WaitingStart, mainMenuScreenLogic::processWaitingCommandStart);

        methods.put(State.WaitingButtonClickInMainMenu, mainMenuScreenLogic::processWaitingButtonClickInMainMenu);
    }

    public SendMessage callLogicMethod(String textFromUser, TransmittedData transmittedData) throws Exception {
        String state = transmittedData.getState();
        return methods.get(state).process(textFromUser, transmittedData);
    }
}
