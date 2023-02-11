package com.techelevator.view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class RealMenu {
    public static void main(String[] args) {
        HashMap<String, Integer> itemQuantities = new HashMap<>();
        for (int i = 0; i < 16; i++) {
            Slots slotTest = new Slots(i);
            itemQuantities.put(slotTest.generateItemName(), 5);
        }
        System.out.println(itemQuantities);
        itemQuantities.replace("Cola", itemQuantities.get("Cola")-1);
        System.out.println(itemQuantities);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        String simpleFormat = dateFormat.format(date);
        System.out.println("Simple format: " + simpleFormat);

    }




    public static void gatheringListForQuantity(Map<String, Integer> itemQuantity){

    }


    }

