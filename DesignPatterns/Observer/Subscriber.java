package Observer;

public class Subscriber {

    private final String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String title) {
        System.out.println(name + ", new video uploaded - " + title);
    }
}
