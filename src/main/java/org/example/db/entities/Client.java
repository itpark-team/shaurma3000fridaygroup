package org.example.db.entities;

public class Client {
    private int id;
    private long chatId;
    private int bonusRubles;
    private String bankCard;
    private String fio;
    private String phoneNumber;

    public Client(int id, long chatId, int bonusRubles, String bankCard, String fio, String phoneNumber) {
        this.id = id;
        this.chatId = chatId;
        this.bonusRubles = bonusRubles;
        this.bankCard = bankCard;
        this.fio = fio;
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public long getChatId() {
        return chatId;
    }

    public int getBonusRubles() {
        return bonusRubles;
    }

    public String getBankCard() {
        return bankCard;
    }

    public String getFio() {
        return fio;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
