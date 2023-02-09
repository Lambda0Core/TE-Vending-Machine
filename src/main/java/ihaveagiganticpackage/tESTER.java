package ihaveagiganticpackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class tESTER {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        //testing grounds
        String test = "";
        String inputFile = "C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\vendingmachine.csv";
        String ID = "";
        File fileFile = new File(inputFile);
        List<String> allLines = new ArrayList();
        try {
            Scanner vendcsv = new Scanner(fileFile);
            allLines = Files.readAllLines(Path.of(inputFile));

        }catch (Exception ex){
            System.out.println("Whoops! I tripped whilst preparing your list, I sincerely apologize but would you please run that by me again?");
        }
        for (int i = 0; i < allLines.size(); i++) {
            System.out.println(allLines.get(i));

        }
        String A1 = "A1";
        double A1price = 0.0;
            for (int i = 0; i < allLines.size(); i++) {
                if (allLines.get(i).contains(A1))
                { A1price = Double. parseDouble(allLines.get(i));

                }
                System.out.println(allLines.get(0) + " is " + A1price + "$");
            }
        userInput.close();

    }
}
