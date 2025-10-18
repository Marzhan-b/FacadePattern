import FacadePattern.*;


public class Main {
    public static void main(String[] args) {
        ReceptionFacade reception = new ReceptionFacade();
        TouristClient tourist = new TouristClient("Marzhan", reception);
        BusinessClient business = new BusinessClient("Batyrkhan", reception);

        reception.serveClients(tourist, business);
    }

}
