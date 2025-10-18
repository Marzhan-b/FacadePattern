package FacadePattern;

public class ReceptionFacade {
    private String nameHotel;
    private String startMessage;
    private String endMessage;


    private RoomService roomService;
    private CleaningService cleaningService;
    private SpaService spaService;
    private TaxiService taxiService;

    public ReceptionFacade() {
        this.nameHotel = "Eleon";
        this.startMessage = "Starting hotel services";
        this.endMessage = "All services completed successfully ";

        this.roomService = new RoomService();
        this.cleaningService = new CleaningService();
        this.spaService = new SpaService();
        this.taxiService = new TaxiService();
    }

    public String getNameHotel() {
        return nameHotel;
    }
    public void setNameHotel (String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getStartMessage() {
        return startMessage;
    }
    public void setStartMessage (String startMessage) {
        this.startMessage = startMessage;
    }

    public String getEndMessage() {
        return endMessage;
    }
    public void setEndMessage (String endMessage) {
        this.endMessage = endMessage;
    }

    public RoomService getRoomService() {
        return roomService;
    }
    public void setRoomService(RoomService roomService) {
        this.roomService=roomService;
    }

    public CleaningService getCleaningService() {
        return cleaningService;
    }
    public void setCleaningService(CleaningService cleaningService) {
        this.cleaningService=cleaningService;
    }

    public SpaService getSpaService() {
        return spaService;
    }
    public void setSpaService(SpaService spaService) {
        this.spaService=spaService;
    }

    public TaxiService getTaxiservice() {
        return taxiService;
    }
    public void setTaxiService(TaxiService taxiService) {
        this.taxiService=taxiService;
    }

    public String orderRoomService() {
        return roomService.performService();
    }
    public String callCleaningService() {
        return cleaningService.performService();
    }

    public String bookSpaService() {
        return spaService.performService();
    }
    public String requestTaxiService() {
        return taxiService.performService();
    }

    public void serveClients(TouristClient tourist, BusinessClient business) {
        String message =
                "Serving clients at " + nameHotel + ":\n\n" +
                        tourist.useServices() + "\n\n" +
                        business.useServices() + "\n" +
                        "All clients have been served successfully!";

        System.out.println(message);
    }


}
