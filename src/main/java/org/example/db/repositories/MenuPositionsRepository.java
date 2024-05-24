package org.example.db.repositories;

import org.example.db.DbConnector;

import java.sql.Connection;

public class MenuPositionsRepository {
    private Connection connection = null;

    public MenuPositionsRepository() {
        connection = DbConnector.getInstance().getConnection();
    }
}
