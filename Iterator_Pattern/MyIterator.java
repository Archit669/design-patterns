public interface MyIterator<T>{
    boolean hasNext();
    T next();
    boolean hasPrev();
    T prev();
}