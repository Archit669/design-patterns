import java.util.ArrayDeque;
import java.util.Deque;

public class AtmHandler {

    private final int denomination;
    private int noteAmount;
    private final AtmHandler nextAtmHandler;
    private final Deque<String> deque; 

    public AtmHandler(final int denomination, final int noteAmount, final AtmHandler nextAtmHandler) {
        this.denomination = denomination;
        this.noteAmount = noteAmount;
        this.nextAtmHandler = nextAtmHandler;
        this.deque = new ArrayDeque<>();
    }

    public void handleMoney(final int amount) {

        if (amount <= 0) {
            deque.clear();  
            throw new IllegalArgumentException("Invalid amount entered. Please enter a positive amount.");
        }

        int denominationCount = Math.min(amount / denomination, noteAmount);
        int amountDispensed = denominationCount * denomination;
        int remainingAmount = amount - amountDispensed;

        if (denominationCount > 0) {
            deque.addFirst(amountDispensed + " has been given in " + denominationCount + " x " + denomination + " notes.");
            noteAmount -= denominationCount;
        }

        if (remainingAmount > 0 && nextAtmHandler != null) {
            nextAtmHandler.handleMoney(remainingAmount);
            deque.addAll(nextAtmHandler.getDeque());  
        } else if (remainingAmount > 0) {
            deque.clear(); 
            throw new IllegalArgumentException("Amount cannot be given due to unavailable denominations for the remaining " + remainingAmount);
        }
        
        printMessages();
    }

    private void printMessages() {
        if (deque.isEmpty()) {
            System.out.println("No amount dispensed.");
        } else {
            while (!deque.isEmpty()) {
                System.out.println(deque.pollLast());  
            }
        }
    }

    public Deque<String> getDeque() {
        return deque;
    }
}