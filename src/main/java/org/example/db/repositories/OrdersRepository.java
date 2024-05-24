package org.example.db.repositories;

import org.example.db.DbConnector;

import java.sql.Connection;

public class OrdersRepository {
    private Connection connection = null;

    public OrdersRepository() {
        connection = DbConnector.getInstance().getConnection();
    }
}
