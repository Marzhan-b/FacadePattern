import FacadePattern.*;


public class Main {
    public static void main(String[] args) {
        ReceptionFacade reception = new ReceptionFacade();

        TouristClient tourist = new TouristClient("John", reception);
        System.out.println(tourist.useServices());
    }
}
