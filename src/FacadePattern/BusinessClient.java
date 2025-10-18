package FacadePattern;

import FacadePattern.ReceptionFacade;

public class BusinessClient {
    private String name;
    private ReceptionFacade reception;

    public BusinessClient(String name, ReceptionFacade reception) {
        this.name = name;
        this.reception = reception;
    }

    public String useServices() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" has arrived.\n");
        sb.append(reception.orderRoomService()).append("\n");
        sb.append(reception.callCleaningService()).append("\n");
        sb.append(reception.requestTaxiService()).append("\n");
        sb.append(name).append(" enjoyed their stay!");
        return sb.toString();
    }
}

