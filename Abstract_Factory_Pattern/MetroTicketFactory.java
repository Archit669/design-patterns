public class MetroTicketFactory implements TicketAbstractFactory{
    @Override
    public Ticket create() {
        return new MetroTicket();
    }
}