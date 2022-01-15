package com.company;

import java.util.ArrayList;

public class Hospital {

    private ArrayList<Client> clients;
    private ER er;
    public Hospital() {
        clients = new ArrayList<>();
        er = new ER();
    }

    public void addClient(){
        clients.add(new Client());
    }

    public void removeClient(int clientNumber){
        for (Client client: clients)
            if(client.getClientNumber() == clientNumber)
                clients.remove(client);
    }

    public void addPetToClient(int clientNumber, Animal animal){
        for (Client client: clients)
            if(client.getClientNumber() == clientNumber)
                client.addPet(animal);
    }

    public void removePetFromClient(int clientNumber, int chipNumber) {
        for (Client client : clients)
            if (client.getClientNumber() == clientNumber)
                client.removePet(chipNumber);
    }

    public void sendAd(String content) {
        System.out.println("Ad content: " + content);
        System.out.println("Sending ad...");
        for (Client client : clients)
            if(client.isAds())
                System.out.println(client);
    }

    public void sendMessageToDogOwners() {
        System.out.println("Sending vaccine messages to dog owners...");

        for (int i=0;i<clients.size();i++) {
            Client client = clients.get(i);
            boolean sent = false;
            for(int j =0;j< client.getPets().size() && !sent;j++){
                Animal a = client.getPets().get(i);
                if(a.getType().equals("dog")){
                    System.out.println(client);
                    sent = true;
                }
            }
        }

    }

    public boolean addPetToER(int chipNumber) {
        for (int i = 0; i < clients.size(); i++) {
            Client client = clients.get(i);
            for (int j = 0; j < client.getPets().size(); j++) {
                Animal a = client.getPets().get(i);
                if(a.getChipNumber() == chipNumber) {
                    return er.addPet(a);
                }
            }
        }
        return false;
    }

    public void removePetFromER(int chipNumber) {
        Client owners =null;
        boolean found = false;
        for (int i = 0; i < clients.size() && !found; i++) {
            Client client = clients.get(i);
            for (int j = 0; j < client.getPets().size(); j++) {
                Animal a = client.getPets().get(i);
                if (a.getChipNumber() == chipNumber) {
                    owners = client;
                    found = true;
                    break;
                }
            }
        }
        if(owners != null) {
            System.out.println("Removing pet... ");
            System.out.println(owners);
            er.removePet(chipNumber);
        }
    }

    public ER getEr() {
        return er;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }
}
