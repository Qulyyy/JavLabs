package lab10;

import java.util.Scanner;

public class num11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = countOnes(scanner);
        System.out.println(count);
    }

    public static int countOnes(Scanner scanner) {
        int n = scanner.nextInt();
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1 + countOnes(scanner);
        } else {
            return countOnes(scanner);
        }
    }
}
