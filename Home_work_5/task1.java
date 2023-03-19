package Home_work_5;

/* Home work 5 - Task 1
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class task1 {
    
    public static void main(String[] args) {
        Map<String, List<String>> PhoneBook = new HashMap<>();
        PhoneBook.put("Ivanov", List.of("1218", "4561"));
        PhoneBook.put("Petrov", List.of("5590", "8926"));
        PhoneBook.put("Sidorov", List.of("6672", "2624"));

        menu(PhoneBook);

    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        // scanner.close();
        return scan;
    }

    public static void find(Map<String, List<String>> PhoneBook) {
        System.out.println("Введите имя: ");
        String name = scanner();
        System.out.println(PhoneBook.get(name));
    }

    public static void allBook(Map<String, List<String>> PhoneBook) {
        System.out.println(PhoneBook);

    }

    public static Map<String, List<String>> add(Map<String, List<String>> PhoneBook) {
        
        System.out.println("Введите имя: ");
        String name = scanner();
        List<String> number = new ArrayList<>();
        System.out.println("Вводите номера телефонов в запись телефонной книги один за одним");
        System.out.println("Для окончания ввода номеров телефонов - введите 'stop' в поле телефон");
        while (true) {
    
            System.out.println("Введите номер: ");
            String phon = scanner();
            if (phon.equals("stop")) {
                break;
            } else {
                number.add(phon);
            }
        }
        PhoneBook.put(name, number);

        return PhoneBook;
    }

    public static Map<String, List<String>> menu(Map<String, List<String>> PhoneBook) {
        
        while (true) {
            System.out.println();
            System.out.println(
                "Команды калькулятора: find - найти контакт, add - добавить контакт, list - показать всю телефонную книгу, exit - выйти");
            String comands = scanner();
            if (comands.equals("exit")) {
                break;
            } else {
                switch (comands) {
                    case "find":
                        find(PhoneBook);
                        break;
                    case "add":
                        add(PhoneBook);
                        break;
                    case "list":
                        allBook(PhoneBook);
                        break;
                    default:
                        break;
                }
            }
        }
        return PhoneBook;
    }
    


}
