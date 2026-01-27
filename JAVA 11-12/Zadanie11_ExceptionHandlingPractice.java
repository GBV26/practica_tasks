import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie11_ExceptionHandlingPractice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число для деления: ");
            int divisor = scanner.nextInt();

            int result = 100 / divisor;
            System.out.println("Результат: " + result);
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: Введите корректное число!");
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль невозможно!");
        } finally {
            scanner.close();
            System.out.println("Сканнер закрыт.");
        }
    }
}