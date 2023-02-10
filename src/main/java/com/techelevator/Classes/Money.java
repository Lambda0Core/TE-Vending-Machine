package com.techelevator.Classes;

public class Money extends Slots {

    private double inputMoney;
    private double outputMoney;
    private double totalSales;


    public double getInputMoney() {
        return inputMoney;
    }

    public double getOutputMoney() {
        return outputMoney;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setInputMoney(double inputMoney) {
        this.inputMoney = inputMoney;
    }

    public Money(double inputMoney, double itemPrice) {
        super(itemPrice);
        this.inputMoney = inputMoney;
    }

    public double moneySale(double inputMoney, double itemPrice){
        if(inputMoney >= itemPrice){
            inputMoney-=itemPrice;
            outputMoney = inputMoney;
            inputMoney =0.0;
            setQuantity(getQuantity(getCount())-1);
            return outputMoney;
        }else{
            return inputMoney;
        }

    }


}
