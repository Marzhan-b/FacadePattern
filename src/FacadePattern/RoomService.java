package FacadePattern;

public class RoomService implements IEleonHotel {
    private String serviceName;
    private String serviceAction;

    public RoomService() {
        this.serviceName = "Room Service";
        this.serviceAction = "The dinner is in your room,Bon appetit!";
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceAction() {
        return serviceAction;
    }

    public void setServiceAction(String serviceAction) {
        this.serviceAction = serviceAction;
    }

    @Override
    public String performService() {
        return serviceName + ": " + serviceAction;
    }
}
