package Home_work_1;

/**
 * task3
 * Реализовать простой калькулятор (+ - / *)
 * Ввод числа ->
 * Ввод знака ->
 * Ввод числа ->
 */

 import java.util.Scanner;

public class task3 {    

    // получения операнда
    static int scanNumber() {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    // получения операции
    static String scanOperations() {
        Scanner scan = new Scanner(System.in);
        String operations = scan.nextLine();
        return operations;

    }

    // метод получения результата
    static int getResult(String opr, int num1, int num2) {
        int result = 0;
        switch (opr) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                System.out.println("Неверный оператор. Результат опрации не определен.");
                System.out.println("В качестве оператора может быть только -, +, * или /");
                break;
        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println("Введите первый операнд: ");
        int num1 = scanNumber();
        System.out.println("Введите оператор: -, +, *, /");
        String operations = scanOperations();
        System.out.println("Введите первый операнд: ");
        int num2 = scanNumber();
        int result = getResult(operations, num1, num2);
        System.out.printf("%d %s %d = %d", num1, operations, num2, result);
    }

}
    
