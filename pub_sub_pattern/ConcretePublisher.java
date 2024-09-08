public class ConcretePublisher implements Publisher {
    private final MessageBroker messageBroker;

    public ConcretePublisher(MessageBroker broker) {
        this.messageBroker = broker;
    }

    @Override
    public void publish(String topic, String message) {
        System.out.println("Publisher sent to topic \"" + topic + "\": " + message);
        messageBroker.notifySubscribers(topic, message);
    }
}
