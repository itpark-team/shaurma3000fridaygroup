package org.example.db.repositories;

import org.example.db.DbConnector;

import java.sql.Connection;

public class ProductTypesRepository {
    private Connection connection = null;

    public ProductTypesRepository() {
        connection = DbConnector.getInstance().getConnection();
    }
}
