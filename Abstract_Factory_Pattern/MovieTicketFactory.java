public class MovieTicketFactory implements TicketAbstractFactory{
    @Override
    public Ticket create() {
        return new MovieTicket();
    }
}