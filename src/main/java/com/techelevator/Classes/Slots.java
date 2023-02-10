package com.techelevator.Classes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Slots {
    //properties
    private List<String> idNum = new ArrayList<>();
    private List<String> itemName = new ArrayList<>();
    private List<Double> itemPrice = new ArrayList<>();
    private List<String> category = new ArrayList<>();
    private int quantity;
    private int count;

    //constructor

    public Slots(int count, int quantity) {
        this.count = count;
        this.quantity = quantity;
    }
    //getters

    public List<String> getIdNum() {
        return idNum;
    }

    public List<String> getItemName() {
        return itemName;
    }

    public List<Double> getItemPrice() {
        return itemPrice;
    }

    public List<String> getCategory() {
        return category;
    }

    public int getCount() {
        return count;
    }
    public int getQuantity() {
        return quantity;
    }
    //setters

    public void setCount(int count) {
        this.count = count;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Methods

    public String generateList(){
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
                ;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        };
        return idNum.get(count) + "|" + itemName.get(count) + "|" + itemPrice.get(count) + "|" + category.get(count);

    }
}

