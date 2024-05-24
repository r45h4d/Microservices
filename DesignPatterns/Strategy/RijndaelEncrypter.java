package Strategy;

public class RijndaelEncrypter implements EncrypterStrategy {

    @Override
    public String encrypt(String obj) {
        System.out.println("Encrypt with Rijndael : " + obj);
        return obj;
    }

    @Override
    public String decrypt(String obj) {
        System.out.println("Decrypt with Rijndael : " + obj);
        return obj;
    }
}
