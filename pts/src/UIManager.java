import DataProcessing.LogData;
import UI.CategorySearchUI;
import UI.SearchUI;
import Util.CommonConstants;

public class UIManager {
    public static void main(String[] args) {
        LogData logData = new LogData();
        CommonConstants constants = new CommonConstants();

        LogData.initializeLogData();
        System.out.println(LogData.getLogEventNames() + "\n");
        System.out.println(LogData.getLogComponents() + "\n");

        constants.menu();
    }
}