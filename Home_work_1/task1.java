package Home_work_1;

/* Home work 1 - Task 1
 * Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
 * Ввод:5
 * Треугольное число 1 + 2 + 3 + 4 + 5 = 15
 * n! 1 * 2 * 3 * 4 * 5 = 120
 */

 import java.util.Scanner;

public class task1 {
 
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число N: ");
        int n = iScanner.nextInt();

        int factor = 1;
        int triang = 0;

        for (int i = n; i > 0; i--) {
            factor *= i;
            triang += i;
        }
        System.out.printf("Треугольное число: %d\n", triang);
        System.out.printf("Факториал: %d\n", factor);
        iScanner.close();   
    }

}
