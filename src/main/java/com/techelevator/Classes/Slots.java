package com.techelevator.Classes;

import java.util.HashMap;
import java.util.Map;

public class Slots {

    private final int quantity;
    private final String slotID;
    private String category;


    private Map<String, String> slot = new HashMap<>();

    public Slots(String slotID, int quantity, Map<String, String> slot, String category) {
        this.slotID = slotID;
        this.quantity = quantity;
        this.slot = slot;
    }

    //replace the value with out of stock; temp
    public String dispenseItem() {
        slot.replace(slotID, "out of stock");
        return category;
    }

    //potential method for populating map with textfile




}
