package lab10;

public class num10 {
    public static void main(String[] args) {
        int n = 12345;
        int reversed = reverseNumber(n, 0);
        System.out.println(reversed);
    }

    public static int reverseNumber(int n, int reversed) {
        if (n == 0) {
            return reversed;
        } else {
            int lastDigit = n % 10;
            int remainingDigits = n / 10;
            reversed = reversed * 10 + lastDigit;
            return reverseNumber(remainingDigits, reversed);
        }
    }
}



