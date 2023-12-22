package lab1;

import lab1.Book;

import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book d1 = new Book("Маугли", 200);
        Book d2 = new Book("Война и Мир", 1000);
        Book d3 = new Book("Дуб", 12); d3.setPage(15);
        System.out.println(d1);
        d1.intoStrings();
        d2.intoStrings();
        d3.intoStrings();
    }
}