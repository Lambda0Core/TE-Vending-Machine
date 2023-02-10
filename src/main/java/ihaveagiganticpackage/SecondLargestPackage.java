package ihaveagiganticpackage;

import com.techelevator.Classes.Slots;

import java.awt.image.ImageProducer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class SecondLargestPackage {
    public static void main(String[] args) throws FileNotFoundException {
       String test = "";
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\test.txt";
        File fileFile = new File(inputFile);
        Scanner vendcsv = new Scanner(fileFile);
//            String lineFromFile = vendcsv.findInLine();
        try {
            test = new String(String.valueOf(Files.readAllLines(Path.of(inputFile))));
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.println(test);
        String[] pleaseGodDont = test.split(",|\\|");
//        System.out.println(pleaseGodDont[0]);
        int num = 3;
        //0 thru 3 is the first entry in the text file. 4 thru 8 is the second entry, each entry is equal to the last + 4.
        //0 = slot number, 1 = item name, 2 = item price, 3 = category.
        Map<String, String>itemFood = new HashMap<>();
        try(Scanner fileScanner = new Scanner(inputFile)){

            while(fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] value_split = line.split("\\|");
                if(value_split[3].equals("Chip")) {
//                    Product product = new Chip(value_split[1], Double.parseDouble(value_split[2]));
//                    inventoryMap.put(value_split[0], product);
                    System.out.println(value_split[2]);

            }
        }

        System.out.println(pleaseGodDont[8]);
////


        }

    }
}

