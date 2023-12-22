package lab1;

import java.lang.*;
public class Book {
    private String name;
    private int page;
    public Book(String n, int a){
        name = n;
        page = a;
    }
    public void setPage(int age) {
        this.page = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getPage() {
        return page;
    }
    public String toString(){
        return "книга под названием " + this.name + " имеет " + this.page;
    }
    public void intoStrings(){
        System.out.println(name+" содержит " + page + " страниц и " + page*50 + " строк");
    }
}
