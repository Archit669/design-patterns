public class ConcreteSubscriber implements Subscriber {
    private final String name;

    public ConcreteSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String topic, String message) {
        System.out.println(name + " received on topic \"" + topic + "\": " + message);
    }
}
