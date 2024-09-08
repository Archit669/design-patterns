

class Main{
    public static void main(String[] args) {
        
        Channel channel = new Channel("Hash Define");
        Subscriber subscriber1 = new Subscriber(1, "archit");
        Subscriber subscriber2 = new Subscriber(1, "aman");

        channel.addSubscriber(subscriber1);
        channel.addSubscriber(subscriber2);

        channel.notifyChanges();
    }
}