package FacadePattern.services;

import FacadePattern.IEleonHotel;

public class TaxiService implements IEleonHotel {
    private String serviceName;
    private String serviceAction;

    public TaxiService() {
        this.serviceName = "Taxi Service";
        this.serviceAction = "Taxi will arrive in 7 minutes!";
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
