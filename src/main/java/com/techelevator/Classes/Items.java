package com.techelevator.Classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Items extends Slots {

    private String category;
    private double itemPrice;
    private String itemName;
    private List<String> item = new ArrayList<>();


    public Items(String slotID, String itemName, String category, double itemPrice) {
        super(slotID);
        this.itemPrice = itemPrice;
        this.category = category;
        this.itemName = itemName;
    }

    public Items(double itemPrice) {

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
}


//method for item...?needs to pull from slots?

