import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите число n: ");
            int n = scanner.nextInt();
            int fact = 1;

            for (int i = 1; i <=n; i ++){
                fact = fact*i;
            }
            System.out.println("Факториал числа n: " + fact);
        }
    }
}