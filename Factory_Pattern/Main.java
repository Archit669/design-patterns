class Main{
    public static void main(String[] args) {
        Ticket t1 = TicketFactory.getTicket(TicketFactory.METRO_TICKET);
        Ticket t2 = TicketFactory.getTicket(TicketFactory.MOVIE_TICKET);

        t1.bookTicket();
        t1.priceOfTicket();
        t2.bookTicket();
        t2.priceOfTicket();
    }
}