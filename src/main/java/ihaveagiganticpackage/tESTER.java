package ihaveagiganticpackage;

import com.techelevator.Classes.Money;
import com.techelevator.Classes.Slots;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class tESTER {


    public static void main(String[] args) throws FileNotFoundException {
        //testing grounds
        double inputMoney = 6.10;
        Slots slotA1 = new Slots(0);


        System.out.println(slotA1.generateList());
        for (int i = 0; i < 16; i++) {
            Slots slotAll = new Slots(i);
            System.out.println(slotAll.generateList());
        }
        System.out.println(slotA1.generateListPrice());
        System.out.println(slotA1.getItemPrice(14));
        System.out.println(slotA1.getIdNum(14));
        System.out.println(slotA1.getItemName(14));
        System.out.println(slotA1.getCategory(14));


        Money money = new Money(4.0, 5.5);

        money.moneySale(4.5,slotA1.getItemPrice(0));
        System.out.println(slotA1.getQuantity(0));
        Money money2 = new Money(inputMoney, slotA1.getItemPrice(0));
        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));
        slotA1.setQuantity(slotA1.quantity-1);
        System.out.println(money2.getOutputMoney());
        System.out.println(money2.coinCollector());
        System.out.println(slotA1.getQuantity(0));
        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));
        slotA1.setQuantity(slotA1.quantity-1);
        System.out.println(money2.getOutputMoney());
        System.out.println(money2.coinCollector());
        System.out.println(slotA1.getQuantity(0));
        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));
        slotA1.setQuantity(slotA1.quantity-1);
        System.out.println(money2.getOutputMoney());
        System.out.println(money2.coinCollector());
        System.out.println(slotA1.getQuantity(0));
        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));
        slotA1.setQuantity(slotA1.quantity-1);
        System.out.println(money2.getOutputMoney());
        System.out.println(money2.coinCollector());
        System.out.println(slotA1.getQuantity(0));
        System.out.println(money2.moneySale(inputMoney, slotA1.getItemPrice(0)));
        slotA1.setQuantity(slotA1.quantity-1);

        System.out.println(money2.getOutputMoney());
        System.out.println(money2.coinCollector());
        System.out.println(slotA1.getQuantity(0));
        System.out.println(slotA1.getItemName(0));



    }
}

