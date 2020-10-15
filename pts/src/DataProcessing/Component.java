package DataProcessing;

public class Component {
    private String eventContext;
    private String component;
    private String eventName;
    private String description;
    private String ip;
    private String time;
    private String origin;

    public Component(String time, String eventContext, String component, String eventName, String description, String origin, String ip) {
        this.time = time;
        this.eventContext = eventContext;
        this.component = component;
        this.eventName = eventName;
        this.description = description;
        this.origin = origin;
        this.ip = ip;
    }

    public Component(Component component) {
        this.time = component.time;
        this.eventContext = component.eventContext;
        this.component = component.component;
        this.eventName = component.eventName;
        this.description = component.description;
        this.origin = component.origin;
        this.ip = component.ip;
    }

    public int getUserIdFromDescription() {
        if (description != null && !description.isEmpty()) {
            String splitDescr[] = description.split("'", 3);

            if (splitDescr.length > 1) {
                try {
                    int result = Integer.parseInt(splitDescr[1]);
                    return result;
                } catch (NumberFormatException e){
                    return -1;
                }
            }
        }
        return -1;
    }
    public String getTime(){
        return time;
    }

    public String getEventContext() {
        return eventContext;
    }

    public String getComponent() {
        return component;
    }

    public String getEventName() {
        return eventName;
    }

    public String getDescription() {
        return description;
    }

    public String getOrigin() { return origin; }

    public String getIp() {
        return ip;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @SuppressWarnings("unused")
    private Component() {

    }
}
