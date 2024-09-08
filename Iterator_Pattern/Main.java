public class Main {
    public static void main(String[] args) {

        ArrayListIterator<Integer> iterator = new ArrayListIterator<>();

        // Add elements
        iterator.addElement(1);
        iterator.addElement(2);
        iterator.addElement(3);

        // Iterate over elements
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Iterate over elements in reverse order
        while (iterator.hasPrev()) {
            System.out.println(iterator.prev());
        }
    }
}
