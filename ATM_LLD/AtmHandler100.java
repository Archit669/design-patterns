public class AtmHandler100 extends  AtmHandler{
    
    private static final int HUNDERED = 100;
    private static  int NOTE_AMOUNT = 2;
    
    public AtmHandler100(final AtmHandler nextAtmHandler){
        super(nextAtmHandler);
    }

    @Override
    public void handleMoney(final int amount){

        int twoThousandPossible = amount / HUNDERED;

        if (twoThousandPossible > 0){
            int remainingAmount = amount % HUNDERED;

            System.out.println((amount - remainingAmount) + " has given");

            super.handleMoney(remainingAmount);

        }else{

            super.handleMoney(amount);
        }
    }
}
