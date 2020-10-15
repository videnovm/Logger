package DataProcessing;

import java.util.List;

import DataProcessing.LogData;
public class GetComponents {

    public List<String> allEventNames;
    public List<String> allEventContexts;
    public List<String> allComponents;

    public GetComponents() {
        super();
        allEventNames = LogData.getLogEventNames();
        allEventContexts = LogData.getLogEventContexts();
        allComponents = LogData.getLogComponents();
    }


    public String getSelectedComponent(int choice) {

        return allComponents.get(choice);
    }


    public String getSelectedEventNames(int choice) {

        return allEventNames.get(choice);
    }


    public String getSelectedEventContexts(int choice) {

        return allEventContexts.get(choice);
    }


}