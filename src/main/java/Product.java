public class Product {
    String name;
    double cost;

    private static final String format  = "Товар: %s, цена: %.2f";

    public String getFormatString(){
        return String.format(format, name, cost);
    }

    Product(String name, double cost){
        this.cost = cost;
        this.name = name;
    }
}
