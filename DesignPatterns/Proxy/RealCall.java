package Proxy;

public class RealCall implements Call {
    String phoneNumber;
    @Override
    public void call() {
        System.out.println("Calling " + phoneNumber + "...");
    }
    public RealCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
