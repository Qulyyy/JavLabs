package lab3;

public class TestAuthor {
    public static void main (String[] args) {
        Author a1 = new Author("Charls Dikens", "charls.d@gmail.com", 'm');
        Author a2 = new Author("Djoan Rouling", "Dr.rolly@gmail.com", 'a');

        System.out.println(a1.getName());
        System.out.println(a1.getEmail());
        a1.setEmail("Dr.rolly@edu.mirea.ru");
        System.out.println(a1.getName());
        System.out.println(a1.getGender());
        System.out.println(a2);
    }
}
