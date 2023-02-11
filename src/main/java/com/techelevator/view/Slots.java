package com.techelevator.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

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
        if (quantity <= 0) {
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
    private void categories(List<String> itemLine) {
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("Beverages", "Glug Glug, I am no longer sober I can forget my fears!");
        categoryMap.put("Candy", "Munch Munch, I can't wait to get my teeth filled!");
        categoryMap.put("Chips", "Crunch Crunch, I can't wait to see my scale in the morning!");
        categoryMap.put("Gum", "Chew Chew, I love annoying my dad!");
    }

    public String generateList() {
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
            }
            if (quantity <= 0) {
                itemName.set(count, "sold out");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if (quantity <= 0) {
            itemName.set(count, "sold out");
        }
        return idNum.get(count) + "|" + itemName.get(count) + "|" + itemPrice.get(count) + "|" + category.get(count);

    }

    public String generateListPrice() {
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ;
        return itemName.get(count) + " = " + itemPrice.get(count);
    }

    public String enjoyItem(int count) {
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("Drink", "Glug Glug, I am no longer sober I can forget my fears!");
        categoryMap.put("Candy", "Munch Munch, I can't wait to get my teeth filled!");
        categoryMap.put("Chip", "Crunch Crunch, I can't wait to see my scale in the morning!");
        categoryMap.put("Gum", "Chew Chew, I love annoying my dad!");
        for (String key : categoryMap.keySet())
            if (categoryMap.containsKey(category.get(count))) ;

        return categoryMap.get(category.get(count));
    }
    public String generateIDs() {
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
            }
            if (quantity <= 0) {
                itemName.set(count, "sold out");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if (quantity <= 0) {
            itemName.set(count, "sold out");
        }
        return idNum.get(16);

    }
    public String generateItemName() {
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String out = "Out of Stock";
        File fileFile = new File(inputFile);
        Scanner fileScanner = null;
        try {
            fileScanner = new Scanner(fileFile);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                idNum.add(value_split[0]);
                itemName.add(value_split[1]);
                itemPrice.add(Double.parseDouble(value_split[2]));
                category.add(value_split[3]);
            }
            if (quantity <= 0) {
                itemName.set(count, "sold out");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
        if (quantity <= 0) {
            itemName.set(count, "sold out");
        }
        return itemName.get(count);

    }

    }
