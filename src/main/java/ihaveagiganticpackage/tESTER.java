package ihaveagiganticpackage;

import com.techelevator.Classes.Slots;

import java.io.FileNotFoundException;

public class tESTER {
    public static void main(String[] args) throws FileNotFoundException {
        //testing grounds
        int quant = 5;
        Slots slotA1 = new Slots(4, quant);
        System.out.println(slotA1.generateList());
        for (int i = 0; i < 16; i++) {
            Slots slotAll = new Slots(i, quant);
            System.out.println(slotAll.generateList());
        }



    }
}
