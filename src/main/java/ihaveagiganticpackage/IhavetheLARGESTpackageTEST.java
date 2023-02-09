package ihaveagiganticpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IhavetheLARGESTpackageTEST {

    private static double itemPrice;
    private static double inputMoney;
    private static List<String> testLine = new ArrayList<>();

    public static void main(String[] args) {

         testLine.add("A1");
         testLine.add("Cocain-Cola");
         testLine.add("3.05");
         testLine.add("Soda");
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("Chips", "Munch Munch, Yum Yum!");
        categoryMap.put("Soda", "Glug Glug, I love glorified salt water!");
String munchy = "Chips";
        System.out.println(moneySale(5.0, 5.5, 0) + categories(testLine));
        System.out.println(testLine.get(3));
        System.out.println(categoryMap.get(munchy));

    }

    private static String moneySale(double itemPrice, double inputMoney, double outputMoney){
        if (inputMoney == itemPrice || inputMoney >= itemPrice){
            inputMoney -= itemPrice;
            outputMoney = inputMoney;
            return "temporary response for testing purposes " + outputMoney;
        }else if (inputMoney <= itemPrice){
            return "Sorry but you do not have enough money for this item.";
        }

        return "";
    }

    private static String categories(List<String> itemLine) {
        Map<String, String> categoryMap = new HashMap<>();
        categoryMap.put("Chips", "Munch Munch, Yum Yum!");
        categoryMap.put("Soda", "Glug Glug, I love glorified salt water!");
        String testCat = itemLine.get(3);
        if (categoryMap.get(testCat) == null) {

            return "";
        }
        return " " + categoryMap.get((testCat));
    }
}

