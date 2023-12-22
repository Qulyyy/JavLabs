package lab19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static List<String> readFromFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void main(String[] args) {

        String filePath = "C:/Users/khomy/IdeaProjects/deadline is not a problem/src/lab19/Test.txt";
        List<String> fileContent = readFromFile(filePath);

        System.out.println("First 5 lines from the file:");
        for (int i = 0; i < Math.min(5, fileContent.size()); i++) {
            System.out.println(fileContent.get(i));
        }

        GenericArrayHolder<Double> doubleArrayHolder = new GenericArrayHolder<>(new Double[]{1.1, 2.2, 3.3, 4.4, 5.5});
        double elementAtIndex = doubleArrayHolder.getElementAtIndex(2);
        System.out.println("Element at index 2: " + elementAtIndex);

    }
}