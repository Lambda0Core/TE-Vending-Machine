package com.techelevator.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Slots {

    private int quantity;
    private int i;
    private String slotID;
    private String category;

    public Slots(String slotID, int quantity, String category) {
        this.slotID = slotID;
        this.quantity = quantity;
    }

    public Slots(String slotID) {

    }

    public Slots() {
    }

    //replace the value with out of stock; temp
    public String dispenseItem() {
        slot.replace(slotID, "out of stock");
        return category;
    }
//method loads items from text
    public String loadItems() {
        String test = "";
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        File fileFile = new File(inputFile);
        try {
            Scanner vendcsv = new Scanner(fileFile);
            test = new String(String.valueOf(Files.readAllLines(Path.of(inputFile))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] pleaseGodDont = test.split(",|\\|");
        //0 thru 3 is the first entry in the text file. 4 thru 8 is the second entry, each entry is equal to the last + 4.
        //0 = slot number, 1 = item name, 2 = item price, 3 = category.
        //use setter for int i to go through desired index depending on user selection.
        return pleaseGodDont[i];
    }

    //potential method for populating map with textfile




}
