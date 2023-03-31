import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int sumN = 0;

            for (int i = 1; i <= n; i++) {
                sumN = sumN + i; 
            }
            System.out.println("Сумма первых n натуральных чисел: " + sumN);
        }
    }
}