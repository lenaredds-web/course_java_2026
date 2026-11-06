import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class Coffee {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Сколько стоит чашка кофе?");
            int price = scanner.nextInt();
            if (price > 300) {
                System.out.println("Дороговато");
            } else if (price >= 150) {
                System.out.println("Норм");
            } else if (price >= 80) {
                System.out.println("Дешево");
            } else if (price < 80) {
                System.out.println("А это в рублях? А это вообще кофе?");
            }
            System.out.println();
        }

    }
}
