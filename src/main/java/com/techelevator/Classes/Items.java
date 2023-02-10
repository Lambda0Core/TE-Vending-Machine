package com.techelevator.Classes;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class Items {

    private String slotID;
    private String category;
    private double itemPrice;
    private String itemName;
    private int i;
    private List<String> item = new ArrayList<>();


    public Items(String slotID, String itemName, String category, double itemPrice) {
        this.slotID = slotID;
        this.itemPrice = itemPrice;
        this.category = category;
        this.itemName = itemName;
    }

    public Items(double itemPrice) {

    }

    public Items() {
        this.slotID = "NULL";
        this.itemPrice = 0.0;
        this.category = "Dummy";
        this.itemName = "Out of stock";
    }

    private static String categories(List<String> itemLine) {
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("Beverages", "Glug Glug, I am no longer sober I can forget my fears!");
        categoryMap.put("Candy", "Munch Munch, I can't wait to get my teeth filled!");
        categoryMap.put("Chips", "Crunch Crunch, I can't wait to see my scale in the morning!");
        categoryMap.put("Gum", "Chew Chew, I love annoying my dad!");
        String testCat = itemLine.get(3);
        if (categoryMap.get(testCat) == null) {

            return "";
        }
        return " " + categoryMap.get((testCat));
    }

    public String printItem() {
        return slotID + "|" + itemName +"|" +itemPrice + "|" + category;
    }


//    public void loadItems() {
//        String test = "";
//        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
//        File fileFile = new File(inputFile);
//        try {
//            Scanner vendcsv = new Scanner(fileFile);
//            test = new String(String.valueOf(Files.readAllLines(Path.of(inputFile))));
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        String[] pleaseGodDont = test.split(",|\\|");
//        //0 thru 3 is the first entry in the text file. 4 thru 8 is the second entry, each entry is equal to the last + 4.
//        //0 = slot number, 1 = item name, 2 = item price, 3 = category.
//        //use setter for int i to go through desired index depending on user selection.
//        slotID = pleaseGodDont[i];
//        i++;
//        slotItemName = pleaseGodDont[i];
//        i++;
//        slotItemName = pleaseGodDont[i];
//        i++;
//        category = pleaseGodDont[i];
//
////        pleaseGodDont[i];
//    }
}


//method for item...?needs to pull from slots?

