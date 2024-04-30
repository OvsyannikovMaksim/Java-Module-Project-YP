import java.util.ArrayList;

public class Utils {

    private static final String FORMATSUM = "Сумма: %.2f";
    private static final String FORMATEVERYPAY = "Каждый должен заплатить:  %.2f";

    public static String getFormatEveryPay(double cost) {
        return FORMATEVERYPAY + " " + getRub(cost);
    }

    public static String getFormatSum(double cost) {
        return FORMATSUM + " " + getRub(cost);
    }

    private static String getRub(double cost) {
        int costInt = (int) cost;
        if (costInt > 10 & costInt < 20) {
            return "рублей";
        }
        return switch (costInt % 10) {
            case 2, 3, 4 -> "рубля";
            case 5, 6, 7, 8, 9, 0 -> "рублей";
            default -> "рубль";
        };
    }

    public static void printList(ArrayList<Product> productsList) {
        for (Product product : productsList) {
            System.out.println(product.getFormatString() + " " + getRub(product.cost));
        }
    }

    public static double findSum(ArrayList<Product> productsList) {
        double sum = 0.0;
        for (Product product : productsList) {
            sum += product.cost;
        }
        return sum;
    }
}
