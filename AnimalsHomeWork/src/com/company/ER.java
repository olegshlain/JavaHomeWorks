package com.company;

import java.util.ArrayList;

public class ER {
    private ArrayList<ERBed> erBeds;

    public ER() {
        erBeds = new ArrayList<>();
    }

    public boolean addPet(Animal a) {
        if(erBeds.size() >= 5) {
            return false;
        }
        erBeds.add(new ERBed(a));
        return true;
    }

    public void removePet(int chipNumber) {
        for(int i=0;i<erBeds.size();i++) {
            ERBed bed = erBeds.get(i);
            if (bed.getAnimal().getChipNumber() == chipNumber)
                erBeds.remove(bed);
        }
    }


}
