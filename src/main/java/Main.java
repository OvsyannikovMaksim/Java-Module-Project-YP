import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int amountOfGuests = -1;
        ArrayList<Product> productsList = new ArrayList<>();

        while (amountOfGuests <= 1) {
            System.out.println("Введите число гостей:");
            if (scanner.hasNextInt()) {
                amountOfGuests = scanner.nextInt();
            } else {
                System.out.println("Необходимо ввести целое число. Повторите попытку.");
                scanner.next();
                continue;
            }
            if (amountOfGuests == 1) {
                System.out.println("Нет смысла сичтать, если Вы один. Повторите попытку.");
            } else if (amountOfGuests < 1) {
                System.out.println("Некорректное число. Повторите попытку.");
            }
        }

        while (true) {
            System.out.println("Введите товар или 'Завершить', для завершения:");
            String name = scanner.next();
            if (name.equalsIgnoreCase("Завершить")) {
                break;
            }
            System.out.println("Введите цену товара (рубли,копейки):");
            if (scanner.hasNextDouble()) {
                double cost = scanner.nextDouble();
                if (cost < 0) {
                    System.out.println("Необходимо ввести положительное дробное число. Повторите попытку.");
                    continue;
                }
                productsList.add(new Product(name, cost));
            } else {
                System.out.println("Необходимо ввести дробное число через запятую. Повторите попытку.");
                scanner.next();
            }
        }

        System.out.println("Добавленные товары:");
        Utils.printList(productsList);

        double sum = Utils.findSum(productsList);

        System.out.printf((Utils.formatSum) + "%n", sum);
        System.out.printf((Utils.formatEveryPay) + "%n", sum/amountOfGuests);
    }
}