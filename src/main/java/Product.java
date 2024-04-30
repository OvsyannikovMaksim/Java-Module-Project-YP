public class Product {
    String name;
    double cost;

    private static final String FORMAT = "Товар: %s, цена: %.2f";

    public String getFormatString() {
        return String.format(FORMAT, name, cost);
    }

    Product(String name, double cost) {
        this.cost = cost;
        this.name = name;
    }
}
