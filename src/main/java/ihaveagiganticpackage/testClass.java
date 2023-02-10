package ihaveagiganticpackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class testClass {
    public static void main(String[] args) {
        //    public Slots(String slotItemName, String slotID, int quantity, String category) {
        //public Items(String slotID, String itemName, String category, double itemPrice)
        int quantity = 0;
        String slotID = "";
        String category = "";
        String slotItemName = "";
        double itemPrice = 0;
        int i = 0;
        //int i = index counter for item list
        //0 = slot number, 1 = item name, 2 = item price, 3 = category. 4 = quantity
//        Slots_rebuilt slot1 = new Slots_rebuilt("A1", slotItemName, itemPrice, category, quantity);
//        Slots_rebuilt slot2 = new Slots_rebuilt("A2", slotItemName, itemPrice, category, quantity);
//        System.out.println(slot1.getSlotID());
//        slot1.loadItems();
//        i++;
//        System.out.println(slot1.getSlotID() + " " + slot1.getSlotItemName() + " " + slot1.getItemPrice() + " " +  slot1.getCategory() + " " +  slot1.getQuantity());
//        slot2.loadItems();
//        System.out.println(slot2.getSlotID() + " " + slot2.getSlotItemName() + " " + slot2.getItemPrice() + " " +  slot2.getCategory() + " " +  slot2.getQuantity());

        //testing grounds
        String test = "";
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String ID = "";
        File fileFile = new File(inputFile);
        List<String> allLines = new ArrayList<>();
        try {
            Scanner vendcsv = new Scanner(fileFile);
            allLines = Files.readAllLines(Path.of(inputFile));
            System.out.println(allLines.get(0));
            System.out.println(allLines.get(0));

    }catch (Exception ex){
        System.out.println("Whoops! I tripped whilst preparing your list, I sincerely apologize but would you please run that by me again?");
    }
}
    }
