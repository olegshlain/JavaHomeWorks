package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hospital h = new Hospital();
        String message = "Hello Welcome to the Hospital..\n"
                + "1) Add Client\n" +
                "2) Remove client\n" +
                "3) Add Pet to client\n" +
                "4) Remove pet from client\n" +
                "5) Send message to dog owners\n" +
                "6) Add pet to ER\n" +
                "7) Remove pet from ER\n" +
                "8) Exit";

        int choice = -1;
        int clientNumber,chipNumber;
        while (choice != 8) {
            choice = IO.getInteger(message);
            switch (choice) {
                case 1:
                    h.addClient();
                    break;
                case 2:
                    clientNumber = IO.getInteger("Enter Client number");
                    h.removeClient(clientNumber);
                    break;
                case 3:
                    clientNumber = IO.getInteger("Enter Client number");
                    h.addPetToClient(clientNumber,new Animal());
                    break;
                case 4:
                    clientNumber = IO.getInteger("Enter Client number");
                    chipNumber = IO.getInteger("Enter Pet Chip number");
                    h.removePetFromClient(clientNumber,chipNumber);
                    break;
                case 5:
                    h.sendMessageToDogOwners();
                    break;
                case 6:
                    chipNumber = IO.getInteger("Enter Pet Chip number");
                    h.addPetToER(chipNumber);
                    break;
                case 7:
                    chipNumber = IO.getInteger("Enter Pet Chip number");
                    h.removePetFromER(chipNumber);
                    break;
            }
        }
    }
}
