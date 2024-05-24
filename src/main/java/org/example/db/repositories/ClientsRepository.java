package org.example.db.repositories;

import org.example.db.DbConnector;

import java.sql.Connection;

public class ClientsRepository {
    private Connection connection = null;

    public ClientsRepository() {
        connection = DbConnector.getInstance().getConnection();
    }
}
