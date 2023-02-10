package ihaveagiganticpackage;

import com.techelevator.Classes.Money;
import com.techelevator.Classes.Slots;

import java.io.FileNotFoundException;

public class tESTER {
    public static void main(String[] args) throws FileNotFoundException {
        //testing grounds
        int quant = 5;
        double inputMoney = 4.05;

        Slots slotA1 = new Slots(0, quant);
        System.out.println(slotA1.generateList());
        for (int i = 0; i < 16; i++) {
            Slots slotAll = new Slots(i, quant);
            System.out.println(slotAll.generateList());
        }
        System.out.println(slotA1.generateListPrice());
        System.out.println(slotA1.getItemPrice(14));
        System.out.println(slotA1.getIdNum(14));
        System.out.println(slotA1.getItemName(14));
        System.out.println(slotA1.getCategory(14));

        Money money = new Money(4.0, 5.5);
        money.moneySale(4.5,slotA1.getItemPrice(0));

        Money money2 = new Money(inputMoney, slotA1.getItemPrice(0));
        System.out.println(money2.getOutputMoney());

        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));

        System.out.println(money2.getOutputMoney());


    }
}
