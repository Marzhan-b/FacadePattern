package FacadePattern.services;

import FacadePattern.IEleonHotel;

public class SpaService implements IEleonHotel {
    private String serviceName;
    private String serviceAction;

    public SpaService() {
        this.serviceName = "Spa Service";
        this.serviceAction = "3 types of massage and jakuzzi ";
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
