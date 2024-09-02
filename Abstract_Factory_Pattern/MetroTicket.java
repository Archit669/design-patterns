public class MetroTicket implements  Ticket{

    @Override
    public void bookTicket() {
        System.out.println("metro ticket Booked");
    }

    @Override
    public double priceOfTicket(){
        System.out.println("500.0");
        return 500.0;
    }
}