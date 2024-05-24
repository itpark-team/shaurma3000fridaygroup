package org.example.db.entities;

public class Order {
    private int id;
    private int clientId;
    private int menuPositionId;
    private int amount;

    public Order(int id, int clientId, int menuPositionId, int amount) {
        this.id = id;
        this.clientId = clientId;
        this.menuPositionId = menuPositionId;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public int getMenuPositionId() {
        return menuPositionId;
    }

    public int getAmount() {
        return amount;
    }
}
