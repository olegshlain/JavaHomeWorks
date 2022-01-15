package com.company;

import java.util.ArrayList;
import java.util.Locale;

public class Client {
    private int clientNumber;
    private String firstName;
    private String lastName;
    private String phone;
    private ArrayList<Animal> pets;
    private boolean ads;

    public Client(int clientNumber, String firstName, String lastName, String phone, ArrayList<Animal> pets, boolean ads) {
        this.clientNumber = clientNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.pets = pets;
        this.ads = ads;
    }

    public Client() {
        this.clientNumber = IO.getInteger("Enter client Number");
        this.firstName = IO.getString("Enter client's name");
        this.lastName = IO.getString("Enter client's last name");
        this.phone = IO.getString("Enter client's phone");
        this.ads = IO.getBoolean("Enter true if client accepts ads false if not");
        String more = IO.getString("Add client pets? Y/N");
        this.pets = new ArrayList<>();
        while(!more.toLowerCase(Locale.ROOT).equals("n")) {
            this.pets.add(new Animal());
            more = IO.getString("Add Another pet? Y/N");
        }
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ArrayList<Animal> getPets() {
        return pets;
    }

    public void addPet(Animal animal) {
        this.pets.add(animal);
    }

    public void removePet(int chipNumber) {
        for (Animal animal: pets)
            if(animal.getChipNumber() == chipNumber)
                pets.remove(animal);
    }

    public boolean isAds() {
        return ads;
    }

    public void setAds(boolean ads) {
        this.ads = ads;
    }

    @Override
    public String toString() {
        return "Client:( " + getFirstName() + " " +  getLastName() + " Phone: " + getPhone() + ")";
    }
}
