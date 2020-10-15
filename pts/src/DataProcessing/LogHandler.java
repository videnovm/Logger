package DataProcessing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import UI.SearchUI;

public class LogHandler {

    private static final String SEPARATOR = ",";
    private static final String FILE_PATH = "C:\\Users\\milos\\IdeaProjects\\pts\\src\\DataProcessing\\log\\logs_BCS37_20181103.csv";


    public static List<Component> buildList() {
        String line;
        String[] logElement;

        List<Component> records = new ArrayList<Component>();

        try (BufferedReader br = new BufferedReader(new FileReader(FILE_PATH))) {
            line = br.readLine();

            while ((line = br.readLine()) != null) {
                logElement = line.split(SEPARATOR);
                if(logElement.length == 8 ) {
                    records.add(
                            new Component(logElement[0] + logElement[1] == null ? "" : logElement[0] + logElement[1] //time
                                    , logElement[2] == null ? "" : logElement[2] //eventContext
                                    , logElement[3] == null ? "" : logElement[3] //component
                                    , logElement[4] == null ? "" : logElement[4] //eventName
                                    , logElement[5] == null ? "" : logElement[5] //description
                                    , logElement[6] == null ? "" : logElement[6] //origin
                                    , logElement[7] == null ? "" : logElement[7] //ip
                            ) );
                } else {
                    records.add(
                            new Component(logElement[0] + logElement[1] == null ? "" : logElement[0] + logElement[1] //time
                                    , logElement[2] == null ? "" : logElement[2] //eventContext
                                    , logElement[3] == null ? "" : logElement[3] //component
                                    , logElement[4] == null ? "" : logElement[4] //eventName
                                    , logElement[5] == null ? "" : logElement[5] //description
                                    , logElement[6] == null ? "" : logElement[6] //origin
                                    , " " //if there isn't ip in log file
                            ) );
                }
            }
            return records;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return records;
        } catch (IOException e) {
            e.printStackTrace();
            return records;
        }

    }
}