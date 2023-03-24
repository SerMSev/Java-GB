package Home_worl_6;

/* Home work 6 - Task 1
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 * Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) 
 * фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map.
 *  Например:
 *  “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры 
 * фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

 import java.util.*;


public class task1 {

    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("HP EliteBook 8460p", 8, "Windows10", 80000, "HP"));
        set.add(new Notebook("HP EliteBook 8460p", 4, "linux", 80000, "HP"));
        set.add(new Notebook("Asus FX712EA", 16, "Windows10", 85000, "ASUS"));
        set.add(new Notebook("Asus FX705DY", 16, "Windows10", 85000, "ASUS"));
        set.add(new Notebook("Lenovo", 8, "linux", 85000, "LENOVO"));
        set.add(new Notebook("Acer", 16, "linux", 90000, "ACER"));

        NBwork operation = new NBwork(set);
        operation.start();

    }
}