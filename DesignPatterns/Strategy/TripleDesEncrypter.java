package Strategy;

public class TripleDesEncrypter implements EncrypterStrategy {
    @Override
    public String encrypt(String obj) {
        System.out.println("Encrypt with TripleDES : " + obj);
        return obj;
    }

    @Override
    public String decrypt(String obj) {
        System.out.println("Decrypt with TripleDES : " + obj);
        return obj;
    }
}
