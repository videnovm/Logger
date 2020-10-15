package Util;

import UI.CategorySearchUI;
import UI.SearchUI;

import java.util.Scanner;

public class CommonConstants {
    public CommonConstants() {
        // restrict instantiation
    }

    public static final String MENU =
            "\n--- Menu ---"+
                    "\n|| 1. Search."+
                    "\n|| w. Search by category.\n";

    public static final String MENU_CHOICE = "Please choose an option from the menu!\n";
    public static final String NO_DATA_FOUND_FOR_USER_CHOICE =
            "\nNo data found for the following user choice: ";
    public static final String WRONG_CHOICE = "Wrong option. Please select available options from menu.";

    public void menu(){
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println(MENU);
        System.out.println(MENU_CHOICE);

        selection = input.nextInt();
        switch (selection) {
            case 1:
                SearchUI searchUI = new SearchUI();
                searchUI.setVisible(true);
                break;
            case 2:
                CategorySearchUI categorySearchUI = new CategorySearchUI();
                categorySearchUI.setVisible(true);
                break;
            default:
                System.out.println(WRONG_CHOICE);
        }
    }
}
