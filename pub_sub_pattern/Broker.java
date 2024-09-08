interface Broker{
    void subscribe(String topic, Subscriber subscriber);
    void unsubscribe(String topic, Subscriber subscriber);
    void notifySubscribers(String topic, String message);
}