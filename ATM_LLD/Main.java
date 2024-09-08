public class Main {
    public static void main(String[] args) {
        
        AtmHandler atm = new AtmHandler2000(new AtmHandler500(new AtmHandler100(null)));
        atm.handleMoney(2800);
    }
}
