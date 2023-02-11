package com.techelevator.view;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Money extends Slots {

    public double inputMoney;
    private double outputMoney;
    private double totalSales;
    private int quarter;
    private int dime;
    private int nickel;
    private double change;
    private double numberDump;
    private int cents;
    private double dollar;
    public static int counter = 0;

    public double getInputMoney() {
        return inputMoney;
    }

    public double getOutputMoney() {
        return outputMoney;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public static int getCounter() {
        return counter;
    }
    public int getCounterFor() {
        return counter;
    }

    public void setInputMoney(double inputMoney) {
        this.inputMoney = inputMoney;
    }

    public Money(double inputMoney, double itemPrice) {
        super(itemPrice);
        this.inputMoney = 0.0;
    }

    public Money(int quantity){
        super(quantity);
    }

    public String moneySale(double inputMoney, double itemPrice) {
        if (inputMoney >= itemPrice) {
            inputMoney -= itemPrice;
            outputMoney = inputMoney;
            setInputMoney(0.0);
            String format = String.format("%.02f", outputMoney);
            change = Double.valueOf(format);
            quantity -= 1;
            return "$" + String.valueOf(outputMoney);
        } else if (inputMoney <= itemPrice) {
        }return "Unfortunately you do not have the funds to purchase these item(s)...Resetting program!";
    }
    public String coinCollector() {
        String dumb = String.valueOf(change);
        String strNew = dumb.replace(".", "");

        int cents = Integer.valueOf(strNew);
//
//        int cents = Integer.parseInt("365");

        int[] coins = {25, 10, 5};
        List<Integer> result = new ArrayList<>();
        for (int coin : coins) {
            if (cents == 0) break;
            result.addAll(Collections.nCopies(cents / coin, coin));
            cents %= coin;
        }
        for (Integer val : result) {
            if (val == 25) {
                quarter++;
            }
            if (val == 10) {
                dime++;
            }
            if (val == 5) {
                nickel++;
            }
        }
        return "Quarters: " + quarter + " Dimes: " + dime + " Nickels: " + nickel;
    }

        //        if (outputMoney >= 0.25) {
//            int quarters = (int) outputMoney/25;
//            if( quarter change = output money% 25;
//            int dimes = quarter change /10;
//            dimes change = something %10
//            int nickles= quarter change /5;
//            nickles change = something %5
//        } return "Quarters: " + quarter + " Nickles: " + nickle + " Dimes: " + dime;
        public double addOneDollar (int counter){
        inputMoney += counter;
        return inputMoney;
        }
    }

