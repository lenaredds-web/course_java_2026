
//Задание: Много раз Попросить пользователя вводить целые числа
//    Остановиться, когда сумма введенных чисел достигнет 42
//    Рассказать, сколько всего он ввел чисел
//+ Каков процент количества положительных чисел?
//  + Чему равна сумма отрицательных чисел?//
import java.util.Scanner;

public class numbers {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalCount = 0;
        int positiveCount = 0;
        int negativeSum = 0;
        int sum = 0;

        System.out.println("Вводите целые числа, пока их сумма не превысит 42");
        while (sum < 42) {
            int number = scanner.nextInt();
                totalCount++;
                sum += number;

                if (number > 0) {
                    positiveCount++;
                } else if (number < 0) {
                    negativeSum += number;
                }
        }
            System.out.println("Результаты");
            System.out.println("Всего введено чисел:" + totalCount);
            if (totalCount > 0) {
                double positivePercentage = ((double) positiveCount / totalCount) * 100;
                System.out.printf("Процент положительных чисел: %.2f%%\n", positivePercentage);
            } else {
                System.out.println("Процент положительных чисел: 0%");
            }
            System.out.println("Сумма отрицательных чисел: " + negativeSum);
            System.out.println("Итоговая сумма: " + sum);

            scanner.close();
        }
    }







