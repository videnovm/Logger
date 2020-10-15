package DataProcessing;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LogData {

    public static List<Component> fullLogData;
    public static List<String> LogTime;
    public static List<String> logComponents;  //stores distinct list of all components
    public static List<String> logEventNames;	//stores distinct list of all EventNames
    public static List<String> logEventContexts; //stores distinct list of all EventContexts
    public static List<String> LogOrigin; //stores distinct list of all Origins
    public static List<String> logIPs; //stores distinct list of all IPs


    public static void initializeLogData() {
        LogData.fullLogData = LogHandler.buildList();

        HashSet<String> timeSet = new HashSet<>();
        HashSet<String> componentSet = new HashSet<String>();
        HashSet<String> eventNameSet = new HashSet<String>();
        HashSet<String> eventContextSet = new HashSet<String>();
        HashSet<String> originSet = new HashSet<>();
        HashSet<String> ipSet = new HashSet<String>();

        for (Component log : fullLogData) {
            timeSet.add(log.getTime());
            componentSet.add(log.getComponent());
            eventNameSet.add(log.getEventName());
            eventContextSet.add(log.getEventContext());
            originSet.add(log.getOrigin());
            ipSet.add(log.getIp());
        }

        LogData.LogTime = new ArrayList<String>(timeSet);
        LogData.logComponents = new ArrayList<String>(componentSet);
        LogData.logEventNames = new ArrayList<String>(eventNameSet);
        LogData.logEventContexts = new ArrayList<String>(eventContextSet);
        LogData.LogOrigin = new ArrayList<>(originSet);
        LogData.logIPs = new ArrayList<>(ipSet);
    }

    public static List<Component> getFullLogData() {
        return fullLogData;
    }

    public static List<String> getLogTime() { return LogTime; }
    public static List<String> getLogComponents() {
        return logComponents;
    }

    public static List<String> getLogEventNames() {
        return logEventNames;
    }

    public static List<String> getLogEventContexts() {
        return logEventContexts;
    }

    public static List<String> getLogOrigin() { return LogOrigin; }

    public static List<String> getLogIPs() {
        return logIPs;
    }

    public LogData() {
    }

}