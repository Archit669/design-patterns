public class AtmHandler2000 extends  AtmHandler {

    private static final int TWO_THOUSAND = 2000;
    private static  int NOTE_AMOUNT = 10;
    
    public AtmHandler2000(final AtmHandler nextAtmHandler){
        super(nextAtmHandler);
    }

    @Override
    public void handleMoney(final int amount){
        
        

        int twoThousandPossible = amount / TWO_THOUSAND;

        if (twoThousandPossible > 0){
            int remainingAmount = amount % TWO_THOUSAND;

            System.out.println((amount - remainingAmount) + " has given ");

            super.handleMoney(remainingAmount);

        }else{

            super.handleMoney(amount);
        }
    }
}
