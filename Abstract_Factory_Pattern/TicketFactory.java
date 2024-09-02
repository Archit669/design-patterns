public class TicketFactory {
    public static Ticket getMeTicket(TicketAbstractFactory ticketAbstractFactory){
        return ticketAbstractFactory.create();
    }
}