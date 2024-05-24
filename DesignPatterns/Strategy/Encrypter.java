package Strategy;

public class Encrypter implements EncrypterStrategy{
    EncrypterStrategy encrypter;

    public Encrypter(EncrypterStrategy encrypter) {
        this.encrypter = encrypter;
    }

    @Override
    public String encrypt(String obj) {
        return encrypter.encrypt(obj);
    }

    @Override
    public String decrypt(String obj) {
        return encrypter.decrypt(obj);
    }
}
