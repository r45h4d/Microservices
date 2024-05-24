package Prototype;

public class PrototypeTest {
    public static void main(String[] args) {
        var document = new Document("Employee", 10.0);
        var cloneDocument = document.copy();
        System.out.println(cloneDocument);
    }
}
