import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1234", "Book1", "Author1", "120");
        Book book2 = new Book("1235", "Book2", "Author2", "135");
        Book book3 = new Book("1236", "Book3", "Author3", "140");
        Main.addBook(book1);
        Main.addBook(book2);
        Main.addBook(book3);
        Main.getAll();
        Main.getById("1235");
        Main.deleteBook("1236");
        Main.getAll();

    }

    static HashMap<String, ArrayList<String>> storage = new HashMap<>();

    public static void addBook(Book book){
        ArrayList<String> info = new ArrayList<>();
        info.add(book.name);
        info.add(book.author);
        info.add(book.pages);
        storage.put(book.id,info);

    }

    public static void getAll(){
        for(String k: storage.keySet()){
            System.out.println(storage.get(k));
        }
    }

    public static void getById(String id){
        System.out.println(storage.get(id));
    }

    public static void deleteBook(String id){
        storage.remove(id);
    }
}