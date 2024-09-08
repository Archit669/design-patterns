
public class Channel extends MyObservable {  

    private final String name;  

    public Channel(String name) {
        super();
        this.name = name;
    }

    @Override
    void addSubscriber(MyObserver so) {
        listOfObservable.add(so);
    }

    @Override
    void removeSubscriber(MyObserver so) {
        listOfObservable.remove(so);
    }

    @Override
    void notifyChanges() {
        for (MyObserver observer : listOfObservable) {
            observer.receiveNotification(); 
        }
    }

}
