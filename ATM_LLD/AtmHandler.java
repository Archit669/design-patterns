public abstract  class AtmHandler {

    private final AtmHandler nextAtmHandler;

    public AtmHandler(final AtmHandler nextAtmHandler){
        this.nextAtmHandler = nextAtmHandler;
    }

    public void handleMoney(final int amount){
        if (this.nextAtmHandler != null){
            this.nextAtmHandler.handleMoney(amount);
        }
    }

}