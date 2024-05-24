package Proxy;

public class ProxyCall implements Call {
    private RealCall realCall;
    private final String phoneNumber;
    @Override
    public void call() {
        if(phoneNumber.length()<10){
            System.out.println("The length of the phone number should not be less than 10 characters");
        }
        else if(phoneNumber.length()>10){
            System.out.println("The length of the phone number should not be more than 10 characters");
        }
        else{
            if(realCall==null) realCall = new RealCall(phoneNumber);
            realCall.call();
        }
    }

    public ProxyCall(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
