package com.company;

public class Animal {
    private String name;
    private int chipNumber;
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
        this.name = IO.getString("Enter Animal name");
        this.chipNumber = IO.getInteger("Enter Animal Chip Number");
        this.type = IO.getString("Enter type of animal");
    }

    public Animal(String name, int chipNumber, String type) {
        this.name = name;
        this.chipNumber = chipNumber;
        this.type = type;
    }

    public int getChipNumber() {
        return chipNumber;
    }

    public void setChipNumber(int chipNumber) {
        this.chipNumber = chipNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
