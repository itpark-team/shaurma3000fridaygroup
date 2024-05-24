package org.example.db.entities;

public class MenuPosition {
    private int id;

    private String name;

    private int productTypeId;

    private String productComposition;

    private String productMeasurement;

    private int calories;

    private int price;

    private String picturePath;

    public MenuPosition(int id, String name, int productTypeId, String productComposition, String productMeasurement, int calories, int price, String picturePath) {
        this.id = id;
        this.name = name;
        this.productTypeId = productTypeId;
        this.productComposition = productComposition;
        this.productMeasurement = productMeasurement;
        this.calories = calories;
        this.price = price;
        this.picturePath = picturePath;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getProductTypeId() {
        return productTypeId;
    }

    public String getProductComposition() {
        return productComposition;
    }

    public String getProductMeasurement() {
        return productMeasurement;
    }

    public int getCalories() {
        return calories;
    }

    public int getPrice() {
        return price;
    }

    public String getPicturePath() {
        return picturePath;
    }
}
