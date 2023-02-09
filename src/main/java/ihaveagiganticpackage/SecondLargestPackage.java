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
        Slots()
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
        System.out.println(pleaseGodDont[8]);
////            String[] words = lineFromFile.split("\\|");
//            System.out.println(words[]);
        Map<String, String> slotItem = new HashMap<>();
        slotItem.put(pleaseGodDont[0], pleaseGodDont[1]);
        Map<String, String> slotTest = new HashMap<>();
        slotTest.put("A1", pleaseGodDont[1]);
        System.out.println(slotTest);
        }
    }
