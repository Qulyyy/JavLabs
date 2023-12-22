package lab11;

import java.util.Arrays;

public class ex3 {

    public static Comparable[] mergeSort(Comparable[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        Comparable[] left  = Arrays.copyOfRange(array, 0, mid);
        Comparable[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static Comparable[] merge(Comparable[] left, Comparable[] right) {
        Comparable[] result = new Comparable[left.length + right.length];
        int leftIndex = 0;
        int rightIndex = 0;
        int resultIndex = 0;

        while (leftIndex < left.length && rightIndex < right.length) {
            if (left[leftIndex].compareTo(right[rightIndex]) <= 0) {
                result[resultIndex++] = left[leftIndex++];
            } else {
                result[resultIndex++] = right[rightIndex++];
            }
        }

        while (leftIndex < left.length) {
            result[resultIndex++] = left[leftIndex++];
        }

        while (rightIndex < right.length) {
            result[resultIndex++] = right[rightIndex++];
        }

        return result;
    }

    public static void main(String[] args) {
        // Пример использования
        Comparable[] list1 = { "Alice", "Bob", "Charlie" };
        Comparable[] list2 = { "David", "Eva", "Frank" };

        Comparable[] mergedList = mergeSort(concatenateArrays(list1, list2));

        System.out.println(Arrays.toString(mergedList));
    }

    private static Comparable[] concatenateArrays(Comparable[] array1, Comparable[] array2) {
        Comparable[] result = Arrays.copyOf(array1, array1.length + array2.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        return result;
    }
}
