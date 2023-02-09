package com.techelevator.Classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Slots_rebuilt {
    //properties
    private int quantity;
    private int i;
    private String slotID;
    private String category;
    private String slotItemName;
    private double itemPrice;

    //constructor

    //0 = slot number, 1 = item name, 2 = item price, 3 = category. 4 = quantity
    public Slots_rebuilt(String slotID, String slotItemName, double itemPrice, String category, int quantity) {
        this.quantity = quantity;
        this.slotID = slotID;
        this.category = category;
        this.slotItemName = slotItemName;
        this.itemPrice = itemPrice;
    }

    //getters and setters
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getSlotID() {
        return slotID;
    }

    public void setSlotID(String slotID) {
        this.slotID = slotID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSlotItemName() {
        return slotItemName;
    }

    public void setSlotItemName(String slotItemName) {
        this.slotItemName = slotItemName;
    }
    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    //method
    public void loadItems() {
        String test = "";
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        File fileFile = new File(inputFile);
        try {
            Scanner vendcsv = new Scanner(fileFile);
            test = new String(String.valueOf(Files.readAllLines(Path.of(inputFile))));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] pleaseGodDont = test.split("\\|");
        //0 thru 3 is the first entry in the text file. 4 thru 8 is the second entry, each entry is equal to the last + 4.
        //0 = slot number, 1 = item name, 2 = item price, 3 = category.
        //use setter for int i to go through desired index depending on user selection.
        slotID = pleaseGodDont[i];
        i++;
        slotItemName = pleaseGodDont[i];
        i++;
        itemPrice = Double.parseDouble(pleaseGodDont[i]);
        i++;
        category = pleaseGodDont[i];


//        pleaseGodDont[i];
    }

}
