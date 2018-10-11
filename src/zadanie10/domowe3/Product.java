package zadanie10.domowe3;

public class Product {
    private String name;
    private String producent;
    private double price;

    public Product(String name, String producent, double price) {
        this.name = name;
        this.producent = producent;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return name+" "+producent+" "+price;
    }

    }
