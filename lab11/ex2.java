package lab11;

import java.util.Comparator;

class Student {
    String name;
    double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }
}

class SortingStudentsByGPA implements Comparator<Student> {

    @Override
    public int compare(Student student1, Student student2) {
        // Сравниваем студентов по их итоговым баллам в порядке убывания
        if (student1.getGpa() > student2.getGpa()) {
            return -1;
        } else if (student1.getGpa() < student2.getGpa()) {
            return 1;
        } else {
            return 0;
        }
    }

    // Метод для выполнения быстрой сортировки
    public void quickSort(Student[] students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    // Метод для разделения массива для быстрой сортировки
    private int partition(Student[] students, int low, int high) {
        double pivot = students[high].getGpa();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students[j].getGpa() >= pivot) {
                i++;

                // Поменять местами элементы в i и j
                Student temp = students[i];
                students[i] = students[j];
                students[j] = temp;
            }
        }

        // Поменять местами опорный элемент и элемент в i+1
        Student temp = students[i + 1];
        students[i + 1] = students[high];
        students[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        // Пример использования
        Student[] students = {
                new Student("Alice", 4.2),
                new Student("Bob", 3.8),
                new Student("Charlie", 4.5),
                new Student("David", 3.9),
        };

        SortingStudentsByGPA sorter = new SortingStudentsByGPA();
        sorter.quickSort(students, 0, students.length - 1);

        System.out.println("Отсортированный список студентов по убыванию GPA:");
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getGpa());
        }
    }
}
