package lab11;

import java.util.Arrays;
import java.util.Random;

class Studento {
    private int[] idNumbers;
    private int size;

    public Studento(int capacity) {
        idNumbers = new int[capacity];
        size = 0;
    }

    public void addIDNumber(int idNumber) {
        idNumbers[size++] = idNumber;
    }

    public void sortIDNumbers() {
        insertionSort();
    }

    private void insertionSort() {
        int n = size;
        for (int i = 1; i < n; ++i) {
            int key = idNumbers[i];
            int j = i - 1;

            while (j >= 0 && idNumbers[j] > key) {
                idNumbers[j + 1] = idNumbers[j];
                j = j - 1;
            }
            idNumbers[j + 1] = key;
        }
    }

    public int[] getIDNumbers() {
        return idNumbers;
    }

    @Override
    public String toString() {
        return "Student{" +
                "idNumbers=" + Arrays.toString(idNumbers) +
                '}';
    }
}

class StudentSortTest {

    public static void main(String[] args) {
        Studento student = generateRandomStudent(10);

        System.out.println("Before sorting:");
        System.out.println(student);

        student.sortIDNumbers();

        System.out.println("\nAfter sorting:");
        System.out.println(student);
    }

    private static Studento generateRandomStudent(int capacity) {
        Studento student = new Studento(capacity);
        Random random = new Random();

        for (int i = 0; i < capacity; i++) {
            student.addIDNumber(random.nextInt(1000));
        }

        return student;
    }
}
