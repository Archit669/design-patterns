import java.util.ArrayList;
import java.util.List;

abstract public class MyObservable {
    List<MyObserver> listOfObservable;

    // Corrected constructor name to match the class name
    MyObservable(){
        listOfObservable = new ArrayList<>();
    }

    abstract void addSubscriber(MyObserver so);

    abstract void removeSubscriber(MyObserver so);

    abstract void notifyChanges();
}
