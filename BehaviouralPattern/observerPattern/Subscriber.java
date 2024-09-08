public class Subscriber implements MyObserver {
    private final String name;
    private final int id;

    Subscriber(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    @Override
    public void receiveNotification() {
        System.out.println("Subscriber " + name + " received notification");
    }
}
