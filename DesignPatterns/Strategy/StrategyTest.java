package Strategy;

public class StrategyTest {
    public static void main(String[] args) {
        String str = "Plain text";
        Encrypter encrypter = new Encrypter(new TripleDesEncrypter());
        String encryptedString = encrypter.encrypt(str);
        String decryptedString = encrypter.decrypt(encryptedString);

        encrypter = new Encrypter(new RijndaelEncrypter());
        encryptedString = encrypter.encrypt(str);
        decryptedString = encrypter.decrypt(encryptedString);
    }
}
