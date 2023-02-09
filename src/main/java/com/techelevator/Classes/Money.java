package com.techelevator.Classes;

public class Money extends Items {

    private double inputMoney;
    private double outputMoney;
    private double totalSales;


    public Money(double inputMoney, double outputMoney, double totalSales, double itemPrice) {
        super(itemPrice);
        this.inputMoney = inputMoney;
        this.outputMoney = outputMoney;
        this.totalSales = totalSales;
    }

    private static String moneySale(double itemPrice, double inputMoney, double outputMoney){
        if (inputMoney == itemPrice || inputMoney >= itemPrice){
            inputMoney -= itemPrice;
            outputMoney = inputMoney;
        }else if (inputMoney <= itemPrice){
            return "Sorry but you do not have enough money for this item.";
        }

        return "Thank you for your purchase! Your total change is:  " + outputMoney;
    }


}
