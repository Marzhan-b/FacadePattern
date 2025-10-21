package FacadePattern.services;

import FacadePattern.IEleonHotel;

public class CleaningService implements IEleonHotel {
    private String serviceName;
    private String serviceAction;

    public CleaningService() {
        this.serviceName = "Cleaning Service";
        this.serviceAction = "Your room will be cleaned soon!";
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
