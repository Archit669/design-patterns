import java.util.ArrayList;

public class ArrayListIterator<T> implements MyIterator<T> {
    private final ArrayList<T> arr;  
    private int currentIndex = 0;   

    public ArrayListIterator() {
        this.arr = new ArrayList<>();
    }

    public ArrayListIterator(ArrayList<T> arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasPrev(){
        return currentIndex >= 0;
    }


    @Override
    public boolean hasNext() {
        return currentIndex < arr.size();
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new IndexOutOfBoundsException("No more elements to iterate.");
        }
        return arr.get(currentIndex++);
    }

    @Override
    public T prev(){
        if (!hasPrev()) {
            throw new IndexOutOfBoundsException("No more elements to iterate.");
        }
        return arr.get(--currentIndex);
    }

    public void addElement(T element) {
        arr.add(element);
    }
}
