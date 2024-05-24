package Observer;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Observable{
    private String title;
    List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void addSubscriber(Subscriber subscriber) {
        this.subscriberList.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        this.subscriberList.remove(subscriber);
    }

    @Override
    public void notifySubscriber() {
        for(Subscriber subscriber : subscriberList){
            subscriber.update(title);
        }
    }

    public void upLoad(String title){
        this.title = title;
        notifySubscriber();
    }
}
