package Home_work_1;
/**
 * task2
 * Вывести все простые числа от 1 до 1000 (до введенного пользователем значения)
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task2 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите верхнюю границу списка натуральных чисел: ");
        int input = scanner.nextInt();
        scanner.close();
        List<Integer> primes = new ArrayList<>();

        for (int i = 2; i <= input; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                primes.add(i);
            }
        }
        System.out.println("Список простых чисел: " + primes);
    }
}
    