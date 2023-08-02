import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите числа в столбик (для завершения ввода введите любой нечисловой символ):");

        int maxNumber = Integer.MIN_VALUE;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
        }

        System.out.println("Наибольшее число: " + maxNumber);
    }
}
