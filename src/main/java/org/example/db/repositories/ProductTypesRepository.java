package org.example.db.repositories;

import org.example.db.DbConnector;
import org.example.db.entities.ProductType;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ProductTypesRepository {
    private Connection connection = null;

    public ProductTypesRepository() {
        connection = DbConnector.getInstance().getConnection();
    }

    public ArrayList<ProductType> getAll() {
        ArrayList<ProductType> productTypes = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();

            String selectQuery = String.format("SELECT * FROM product_types ORDER BY id ASC");

            ResultSet resultSet = statement.executeQuery(selectQuery);

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");


                productTypes.add(new ProductType(id, name));
            }

            resultSet.close();

            statement.close();
        } catch (Exception e) {
            System.out.println("Ошибка запроса к базе данных");
        }

        return productTypes;
    }
}
