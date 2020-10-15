package DataProcessing;

import java.util.ArrayList;
import java.util.Scanner;

public class FilterData {

    public static int SIZE_OF_MDS = 1;

    private ArrayList<String> chosenComponents = new ArrayList<>() ;
    private ArrayList<String> chosenEventContexts = new ArrayList<>() ;
    private ArrayList<String>  chosenEventNames = new ArrayList<>() ;


    public ArrayList<String> getChosenComponents() {
        return chosenComponents;
    }

    public void setChosenComponents(ArrayList<String> chosenComponents) {
        this.chosenComponents = chosenComponents;
    }

    public ArrayList<String> getChosenEventContexts() {
        return chosenEventContexts;
    }

    public void setChosenEventContexts(ArrayList<String> chosenEventContexts) {
        this.chosenEventContexts = chosenEventContexts;
    }

    public ArrayList<String> getChosenEventNames() {
        return chosenEventNames;
    }

    public void setChosenEventNames(ArrayList<String> chosenEventNames) {
        this.chosenEventNames = chosenEventNames;
    }

    public void takeInputChoice() {
        Scanner sc = new Scanner(System.in);

        try {
            int menuChoice  = sc.nextInt();
            if(menuChoice != 1) {
                return;
            }else {
                GetComponents GetComponents = new GetComponents();

                int[] componentsChoices = new int[SIZE_OF_MDS];
                int[] eventContextChoices = new int[SIZE_OF_MDS];
                int[] eventNamesChoices = new int[SIZE_OF_MDS];

				/*int[] eventContextChoices = new int[] {7,35,10,41};
				int[] componentsChoices = new int[] {8,8,8,8};
				int[] eventNamesChoices = new int[] {23,23,23,23};*/

                for(int i = 0 ; i < SIZE_OF_MDS ;i++) {
                    chosenEventContexts.add(GetComponents.getSelectedEventContexts(eventContextChoices[i]));
                    chosenComponents.add(GetComponents.getSelectedComponent(componentsChoices[i]));
                    chosenEventNames.add(GetComponents.getSelectedEventNames(eventNamesChoices[i]));
                }
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Error");
            return ;
        }
    }

}