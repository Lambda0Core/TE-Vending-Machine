package com.techelevator;

import com.techelevator.view.Money;
import com.techelevator.view.Slots;
import com.techelevator.view.VendingMenu;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * What we have left to do:
 *
 * A). We need to connect all of our classes to our executable.
 * B). Create backend executable.
 * C). List vendingmachine.csv in menu
 * D). Be able to select based on entry's first index
 * E). Accept money, return change and item.
 * F).
 */


public class VendingMachineCLI {

	private static final String MAIN_MENU_OPTION_DISPLAY_ITEMS = "Display Vending Machine Items";
	private static final String MAIN_MENU_OPTION_PURCHASE = "Purchase";
	private static final String MAIN_MENU_OPTION_EXIT = "Exit";
	private static final String MAIN_MENU_SECRET_OPTION = "*Sales Report";

	private static final String PURCHASE_MENU_OPTION_FEED_MONEY = "Feed Money";
	private static final String PURCHASE_MENU_OPTION_SELECT_PRODUCT = "Select Product";
	private static final String PURCHASE_MENU_OPTION_FINISH_TRANSACTION = "Finish Transaction";

	//Dollars
	private static final String FEED_MONEY_MENU_OPTION_SELECT_ONE_DOLLAR_BILL = "One Dollar";
	private static final String FEED_MONEY_MENU_OPTION_SELECT_FIVE_DOLLAR_BILL = "Five Dollar";
	private static final String FEED_MONEY_MENU_OPTION_SELECT_TEN_DOLLAR_BILL = "Ten Dollar";
	private static final String FEED_MONEY_MENU_OPTION_SELECT_RETURN_TO_PURCHASE_MENU = "Return to Purchase Menu";

	private static final String[] MAIN_MENU_OPTIONS = {MAIN_MENU_OPTION_DISPLAY_ITEMS, MAIN_MENU_OPTION_PURCHASE, MAIN_MENU_OPTION_EXIT};
	private static final String[] PURCHASE_MENU_OPTIONS = {PURCHASE_MENU_OPTION_FEED_MONEY, PURCHASE_MENU_OPTION_SELECT_PRODUCT, PURCHASE_MENU_OPTION_FINISH_TRANSACTION};
	private static final String[] FEED_MONEY_MENU_OPTIONS = {FEED_MONEY_MENU_OPTION_SELECT_ONE_DOLLAR_BILL, FEED_MONEY_MENU_OPTION_SELECT_FIVE_DOLLAR_BILL, FEED_MONEY_MENU_OPTION_SELECT_TEN_DOLLAR_BILL, FEED_MONEY_MENU_OPTION_SELECT_RETURN_TO_PURCHASE_MENU};
	Money money = new Money(0);
	Date date = new Date();
	DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
	private VendingMenu menu;

	private Slots slotQuant = new Slots(15);
	private static Map<String, Integer> itemQuantity = new HashMap<>();
	private double debt;
	private boolean LocalDateTime;
	private int counterForAudit;
	List<String> logger = new ArrayList<String>();


	public VendingMachineCLI(VendingMenu menu) {
		this.menu = menu;
	}

	public static void stocking(){
		HashMap<String, Integer> itemQuantity = new HashMap<>();
		for (int i = 0; i < 16; i++) {

			Slots prevSlot = new Slots(i);
			itemQuantity.put(prevSlot.getItemName(i), 5);
		}
	}

	public void run() {
		boolean running = true;
		while (running) {

			String choice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			// A switch statement could also be used here.  Your choice.
			if (choice.equals(MAIN_MENU_OPTION_DISPLAY_ITEMS)) {
				for (int i = 0; i < 16; i++) {
					Slots prevSlot = new Slots(i);
					System.out.println(prevSlot.generateList());
				}
				// display vending machine items
			} else if (choice.equals(MAIN_MENU_OPTION_PURCHASE)) {
				purchaseMenu();

} else if (choice.equals(MAIN_MENU_OPTION_EXIT)) {
				//exits system
				System.exit(1);
			}
			// do purchase
		}
	}


	public static void main(String[] args) {
		for (int i = 0; i < 16; i++) {
			Slots slotTest = new Slots(i);
			itemQuantity.put(slotTest.generateItemName(), 5);
		}
		VendingMenu menu = new VendingMenu(System.in, System.out);
		VendingMachineCLI cli = new VendingMachineCLI(menu);
		cli.run();

	}

	public void purchaseMenu() {
		boolean purchaseRun = true;
		while (purchaseRun) {
			String purchaseC = (String) menu.getChoiceFromOptions(PURCHASE_MENU_OPTIONS);
			if (purchaseC.equals(PURCHASE_MENU_OPTION_FEED_MONEY)) {
				feedMenu();
				purchaseRun = false;
			} else if (purchaseC.equals((PURCHASE_MENU_OPTION_SELECT_PRODUCT))) {
				selectProduct();
				purchaseRun = false;
			}else if (purchaseC.equals(PURCHASE_MENU_OPTION_FINISH_TRANSACTION)){
				finishTransaction();
			}

		}
	}

	public void feedMenu() {
		boolean feedMeBool = true;
		while (feedMeBool) {
			HashMap<String, Integer> itemQuantity = new HashMap<>();
			String feedMun = (String) menu.getChoiceFromOptions(FEED_MONEY_MENU_OPTIONS);
			if (feedMun.equals(FEED_MONEY_MENU_OPTION_SELECT_ONE_DOLLAR_BILL)) {

				Money money = new Money(0);
				money.counter++;
				money.addOneDollar(money.counter);

			} else if (feedMun.equals(FEED_MONEY_MENU_OPTION_SELECT_FIVE_DOLLAR_BILL)) {

				Money money = new Money(0);
				money.counter += 5;
				money.addOneDollar(money.counter);

			} else if (feedMun.equals(FEED_MONEY_MENU_OPTION_SELECT_TEN_DOLLAR_BILL)) {

				Money money = new Money(0);
				money.counter += 10;
				money.addOneDollar(money.counter);
				System.out.println("Logging system transactions...");
			} else if (feedMun.equals(FEED_MONEY_MENU_OPTION_SELECT_RETURN_TO_PURCHASE_MENU)) {
				int counter = (money.getCounterFor() / 2);
				logger.add(dateFormat.format(date) + " FEED MONEY: " + "$" + counter + " $" +money.getCounterFor());
				purchaseMenu();
				feedMeBool = false;

			}
		}

	}

	public void selectProduct() {
		try {
			Scanner userIn = new Scanner(System.in);
			System.out.println("||||||||||||||||||||||||||||||||||||||");
			List<String> testList = new ArrayList<>();
			int index = 0;
			Slots selectSlot = new Slots(15);
			int i = 0;
			List<Integer> listOfIDs = new ArrayList<>();
			List<Integer> shoppingCart = new ArrayList<>();
			List<String> dead = new ArrayList<>();
			for (i = 0; i < 16; i++) {
                dead.add("Out of Stock");
				listOfIDs.add(index);
				index++;
				listOfIDs.add(index);
				Slots prevSlot = new Slots(i);
				if (itemQuantity.get(prevSlot.generateItemName()) == 0){
					prevSlot.setItemName(dead);
				}
				System.out.println(i + ")" + prevSlot.generateList());
				testList.add(prevSlot.generateList());

			}
			//		List<String> testList = new ArrayList<>();
			//		int index = 0;
			//		Slots selectSlot = new Slots(15);
			//		for (int i = 0; i < 16; i++) {
			//			Slots prevSlot = new Slots(i);
			//			System.out.println(i + ")" + prevSlot.generateList());
			//			testList.add(prevSlot.generateList());
			//		}
			//
			//		System.out.println("||||||||||||||||||||||||||||||||||||||");
			//		System.out.println("Which item would you like to purchase? Enter Product ID (E.G. A1 thru A4): ");
			////		System.out.println(selectSlot.generateList());
			//		String useIn = userIn.nextLine();
			//		int n = useIn.length();
			//		String last = String.valueOf(useIn.charAt(n - 1));
			//		int indexNum = Integer.parseInt(last) - 1;
			//		if (useIn.contains(selectSlot.generateIDs())){
			//
			//			}
			//
			//		System.out.println(selectSlot.getIdNum(indexNum) + " " + selectSlot.getItemName(indexNum) + " ...Is this the item you wanted?" );
			//		System.out.println("Our program didn't bite the dust!");
			System.out.println("||||||||||||||||||||||||||||||||||||||");
			System.out.println("Which item would you like to purchase? >>>>> ");
			selectSlot.generateList();
			String useIn = userIn.nextLine();
			int useOut = Integer.parseInt(useIn);
			String indexNum = String.valueOf(i);

			double currentMon = money.getCounterFor() - selectSlot.getItemPrice(useOut);
			String parse = String.valueOf(currentMon);
			String format = String.format("%.02f", currentMon);

			if (useOut <= 15 && itemQuantity.get(selectSlot.getItemName(useOut)) >= 1) {
				logger.add(dateFormat.format(date)
								+ " " +
								selectSlot.getItemName(useOut)
								+ " " +
								selectSlot.getIdNum(useOut)
								+ " $" + money.getCounterFor() + " $" +
								format);

				debt += selectSlot.getItemPrice(useOut);
				System.out.println(selectSlot.enjoyItem(useOut));
				shoppingCart.add(useOut);
				itemQuantity.replace(selectSlot.getItemName(useOut), itemQuantity.get(selectSlot.getItemName(useOut))-1);
				System.out.println(itemQuantity);
			} else {
				System.out.println("invalid selection!");
			}
		}catch (Exception ex){
			System.out.println("Preparing your menu, please wait warmly...");
		}
		purchaseMenu();
	}

	public void finishTransaction() {
		Money money = new Money(0);



		System.out.println(money.moneySale(Money.getCounter(), debt));
		System.out.println(money.coinCollector());

		System.out.println("Logging system transactions...");
		String format = String.format("%.02f", money.getOutputMoney());

		logger.add(dateFormat.format(date)
				+ " " +
				"GIVE CHANGE:"
				+ " $" + format + " $" +
				"0.0");
		File f = new File("C:\\Users\\Student\\workspace\\nlr-12-module-1-capstone-team-6\\log.txt");
		try (PrintWriter fileWriter = new PrintWriter(f)){

		for (String j : logger) {

			fileWriter.println(j + "\n");

		}
		}catch (FileNotFoundException ex){
			System.out.println("File not found.");
		}


		System.exit(1);


	}
}
