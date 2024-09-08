import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MessageBroker implements Broker{
    // Store topic-based subscribers using a HashMap
    private final Map<String, HashSet<Subscriber>> subscribersByTopic = new HashMap<>();
    
    // Subscribe to a specific topic
    @Override
    public void subscribe(String topic, Subscriber subscriber) {
        if (!subscribersByTopic.containsKey(topic)) {
            subscribersByTopic.put(topic, new HashSet<>());
        }
        subscribersByTopic.get(topic).add(subscriber);
    }
    

    // Unsubscribe from a specific topic
    @Override
    public void unsubscribe(String topic, Subscriber subscriber) {
        if (subscribersByTopic.containsKey(topic)) {
            subscribersByTopic.get(topic).remove(subscriber);
        }
    }

    // Notify subscribers of a specific topic
    @Override
    public void notifySubscribers(String topic, String message) {
        HashSet<Subscriber> subscribers = subscribersByTopic.get(topic);
        if (subscribers != null && !subscribers.isEmpty()) {
            for (Subscriber subscriber : subscribers) {
                subscriber.update(topic, message);
            }
        } else {
            System.out.println("No subscribers for topic: " + topic);
        }
    }
}
