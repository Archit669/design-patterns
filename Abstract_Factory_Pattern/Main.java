class Main{
    public static void main(String[] args) {
        Ticket t1 = TicketFactory.getMeTicket(new MetroTicketFactory());
        Ticket t2 = TicketFactory.getMeTicket(new MovieTicketFactory());

        t1.bookTicket();
        t1.priceOfTicket();
        t2.bookTicket();
        t2.priceOfTicket();
    }
}