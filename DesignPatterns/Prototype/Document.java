package Prototype;

public class Document implements CloudStorage{
    private final String name;
    private Double size;

    public Document(String name, Double size) {
        this.name = name;
        this.size = size;
    }

    public Document(Document document){
        this.name = document.name;
        this.size = document.size;
    }

    @Override
    public Object copy() {
        return new Document(this);
    }

    @Override
    public String toString() {
        return "Document{" +
                "name='" + name + '\'' +
                ", size=" + size +
                '}';
    }
}
