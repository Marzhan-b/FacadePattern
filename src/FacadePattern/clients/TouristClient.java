package FacadePattern.clients;

import FacadePattern.ReceptionFacade;

public class TouristClient {
    private String name;
    private ReceptionFacade facade;

    public TouristClient(String name, ReceptionFacade facade) {
        this.name = name;
        this.facade = facade;
    }

    public String useServices() {
        return name + " has arrived.\n" +
                facade.orderRoomService() + "\n" +
                facade.callCleaningService() + "\n" +
                facade.requestTaxiService() + "\n" +
                facade.bookSpaService() + "\n";
    }
}

