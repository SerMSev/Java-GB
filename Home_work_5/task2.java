package Home_work_5;

/* Пусть дан список сотрудников:
Иван Иванов
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Иван Юрин
Петр Лыков
Павел Чернов
Петр Чернышов
Мария Федорова
Марина Светлова
Мария Савина
Мария Рыкова
Марина Лугова
Анна Владимирова
Иван Мечников
Петр Петин
Иван Ежов

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
Отсортировать по убыванию популярности Имени.
*/

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class task2 {

    public static void main(String[] args) {
        List<String> workers = List.of("Иван", "Светлана", "Кристина", "Анна", "Анна",
          "Иван", "Петр", "Павел", "Петр", "Мария", "Марина", "Мария", "Мария",
           "Марина", "Анна", "Иван", "Петр", "Иван");
        System.out.println(repeat(workers));
    }

    public static Map<String, Integer> repeat(List<String> workers) {
        Map<String, Integer> repeatNameCount = new LinkedHashMap<>();

        for (int i = 0; i < workers.size(); i++) {
            if (repeatNameCount.containsKey(workers.get(i))) {
                repeatNameCount.put(workers.get(i), repeatNameCount.get(workers.get(i)) + 1);
            } else {
                repeatNameCount.put(workers.get(i), 1);
            }
        }

        Map<String, Integer> sortedMap = repeatNameCount.entrySet().stream()
                .sorted(Comparator.comparingInt(e -> -e.getValue()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));
        return sortedMap;
    }
    
}
