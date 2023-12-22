package lab2;

import java.util.Arrays;
import java.util.Random;

public class ex4 {
    public static void main(String[] args) {
        int size = 10;

        int[] array = generateRandomArray(size);
        System.out.println("Исходный массив: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    private static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }

        return array;
    }
}
