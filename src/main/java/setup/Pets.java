package setup;

public class Pets {
    public String name;
    public int price;

    public Pets(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
