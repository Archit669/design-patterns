public class MovieTicket implements Ticket {

    @Override
    public void bookTicket() {
        System.out.println("movie ticket Booked");
    }

    @Override
    public double priceOfTicket(){
        System.out.println("1000.0");
        return 1000.0;
    }
}