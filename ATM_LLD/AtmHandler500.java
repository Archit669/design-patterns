public class AtmHandler500 extends  AtmHandler{
    
    private static final int FIVE_HUNDERED = 500;
    private static  int NOTE_AMOUNT = 5;
    
    public AtmHandler500(final AtmHandler nextAtmHandler){
        super(nextAtmHandler);
    }

    @Override
    public void handleMoney(final int amount){

        int twoThousandPossible = amount / FIVE_HUNDERED;

        if (twoThousandPossible > 0){
            int remainingAmount = amount % FIVE_HUNDERED;

            System.out.println((amount - remainingAmount) + " has given ");

            super.handleMoney(remainingAmount);

        }else{

            super.handleMoney(amount);
        }
    }
}
