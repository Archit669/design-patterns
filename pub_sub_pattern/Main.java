public class Main {
    public static void main(String[] args) {
        MessageBroker broker = new MessageBroker();
        
        // Create subscribers for different topics
        Subscriber sub1 = new ConcreteSubscriber("Subscriber 1");
        Subscriber sub2 = new ConcreteSubscriber("Subscriber 2");
        Subscriber sub3 = new ConcreteSubscriber("Subscriber 3");

        // Subscribe to topics
        broker.subscribe("sports", sub1);
        broker.subscribe("news", sub2);
        broker.subscribe("sports", sub3);

        // Create a publisher
        Publisher publisher = new ConcretePublisher(broker);
        
        // Publish messages to different topics
        publisher.publish("sports", "Sports update: Team A won the match!");
        publisher.publish("news", "News update: Elections are coming soon.");
        publisher.publish("technology", "Tech update: New smartphone released!");
        
        // Unsubscribe a subscriber from a topic
        broker.unsubscribe("sports", sub3);

        // Publish another message to the "sports" topic
        publisher.publish("sports", "Sports update: Player X injured in game.");
    }
    
}
