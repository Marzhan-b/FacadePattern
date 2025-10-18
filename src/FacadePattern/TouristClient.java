package FacadePattern;

public class TouristClient {
    private String name;
    private ReceptionFacade facade;

    public TouristClient(String name, ReceptionFacade facade) {
        this.name = name;
        this.facade = facade;
    }

    public String useServices() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" has arrived.\n");
        sb.append(facade.orderRoomService()).append("\n");
        sb.append(facade.callCleaningService()).append("\n");
        sb.append(facade.requestTaxiService()).append("\n");
        sb.append(facade.bookSpaService()).append("\n");
        return sb.toString();
    }
}

