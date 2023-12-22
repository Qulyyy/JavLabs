package lab10;

import java.util.Scanner;

public class num12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printOddNumbers(scanner);
    }

    public static void printOddNumbers(Scanner scanner) {
        int n = scanner.nextInt();
        if (n == 0) {
            return;
        }
        if (n % 2 != 0) {
            System.out.println(n);
        }
        printOddNumbers(scanner);
    }
}
