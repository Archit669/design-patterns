public class Main {
    public static void main(String[] args) {
        try {
            AtmHandler atm = new AtmHandler(2000, 10,
                    new AtmHandler(500, 5,
                            new AtmHandler(100, 3, null)));

            // Test cases
            // atm.handleMoney(450);   
            // atm.handleMoney(2800);  
            atm.handleMoney(100000);  
            // atm.handleMoney(-500);  

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}