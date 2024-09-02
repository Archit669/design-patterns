public class TicketFactory {
    public static final String METRO_TICKET = "METRO_TICKET";
    public static final String MOVIE_TICKET = "MOVIE_TICKET";

    public static Ticket getTicket(String ticketType){
        if (METRO_TICKET.trim().equalsIgnoreCase(ticketType)){
            return new MetroTicket();
        }else{
            return new MovieTicket();
        }
    }
}