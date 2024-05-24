package Proxy;

public class ProxyTest {
    public static void main(String[] args) {
        Call phoneCall = new ProxyCall("1234567890  ");
        phoneCall.call();
    }
}
