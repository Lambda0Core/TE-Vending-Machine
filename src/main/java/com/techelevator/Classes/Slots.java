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
    public int quantity;
    private int count;

    //constructor
    public Slots(int count) {
        this.count = count;
        this.quantity = 5;
        if(quantity <= 0 ){
            itemName.set(count, "sold out");
        }
    }

    public Slots(double itemPrice) {
    }


    //getters
    public String getIdNum(int count) {
        return idNum.get(count);
    }

    public String getItemName(int count) {
        return itemName.get(count);
    }

    public Double getItemPrice(int count) {
        return itemPrice.get(count);
    }

    public String getCategory(int count) {
        return category.get(count);
    }

    public int getCount() {
        return count;
    }
    public int getQuantity(int count) {
        return quantity;
    }
    //setters
    public void setCount(int count) {
        this.count = count;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setItemName(List<String> itemName) {
        this.itemName = itemName;
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
            }
            if(quantity <= 0 ){
                itemName.set(count, "sold out");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if(quantity <= 0 ){
            itemName.set(count, "sold out");
        }
        return idNum.get(count) + "|" + itemName.get(count) + "|" + itemPrice.get(count) + "|" + category.get(count);

    }
    public String generateListPrice(){
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
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        };
        return  itemName.get(count) + " = " + itemPrice.get(count);
    }


}

