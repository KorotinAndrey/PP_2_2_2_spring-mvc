package model;

public class Car {
    private Long Id;
    private String model;
    private String color;
    private int year;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }
}