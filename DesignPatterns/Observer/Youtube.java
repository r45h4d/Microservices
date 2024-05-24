package Observer;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();
        Subscriber subscriber1 = new Subscriber("Fuad");
        Subscriber subscriber2 = new Subscriber("Samir");
        Subscriber subscriber3 = new Subscriber("Nurlan");
        Subscriber subscriber4 = new Subscriber("Tural");

        channel.addSubscriber(subscriber1);
        channel.addSubscriber(subscriber2);
        channel.addSubscriber(subscriber3);
        channel.addSubscriber(subscriber4);

        channel.upLoad("Java advanced backend and microservices");
    }
}
