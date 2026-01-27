import java.util.ArrayList;
import java.util.Collections;

public class Zadanie10_ArrayListPractice {

    public static void main(String[] args) {
        // 1. Создаём список фруктов
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");
        fruits.add("Киви");
        fruits.add("Манго");

        // 2. Выводим все элементы
        System.out.println("--- Исходный список ---");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 3. Удаляем третий элемент (индекс 2)
        fruits.remove(2); 
        System.out.println("\n--- Список после удаления 3-го элемента ---");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }

        // 4. Проверяем, содержит ли список "яблоко"
        boolean hasApple = fruits.contains("Яблоко");
        System.out.println("\nСодержит 'Яблоко'? " + hasApple);

        // 5. Сортируем по алфавиту
        Collections.sort(fruits);
        System.out.println("\nОтсортированный список:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
        
        // --- Дополнительная задача ---
        System.out.println("\n--- Дополнительная задача: Имена на 'А' ---");
        ArrayList<String> names = new ArrayList<>();
        names.add("Анна");
        names.add("Борис");
        names.add("Алексей");
        names.add("Виктор");
        
        for (String name : names) {
            if (name.startsWith("А")) {
                System.out.println(name);
            }
        }
    }
}