package lab13;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Задаем имя файла
        String fileName = "example.txt";

        try {
            // 1. Реализовать запись в файл введенной с клавиатуры информации
            System.out.println("Введите информацию для записи в файл:");
            String input = reader.readLine();
            writeToFile(fileName, input);

            // 2. Реализовать вывод информации из файла на экран
            System.out.println("Содержимое файла:");
            readFromFile(fileName);

            // 3. Заменить информацию в файле на информацию, введенную с клавиатуры
            System.out.println("Введите новую информацию для замены:");
            String newInput = reader.readLine();
            replaceInFile(fileName, input, newInput);

            // 4. Добавить в конец исходного файла текст, введенный с клавиатуры
            System.out.println("Введите текст для добавления в конец файла:");
            String additionalText = reader.readLine();
            appendToFile(fileName, additionalText);

            // Повторный вывод обновленного файла
            System.out.println("Обновленное содержимое файла:");
            readFromFile(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static void writeToFile(String fileName, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
        }
    }

    private static void readFromFile(String fileName) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    private static void replaceInFile(String fileName, String oldContent, String newContent) throws IOException {
        String fileContent = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                fileContent += line + "\n";
            }
        }

        fileContent = fileContent.replace(oldContent, newContent);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(fileContent);
        }
    }

    private static void appendToFile(String fileName, String additionalContent) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write("\n" + additionalContent);
        }
    }
}

