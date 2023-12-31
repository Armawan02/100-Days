package armawan;
import java.util.LinkedList;
public class Days84 {
    public static void main(String[] args) {
        LinkedList <String> bahasa = new LinkedList<>();
        bahasa.add("Python");
        bahasa.add("jafa");
        bahasa.add("C++");
        bahasa.add("PHP");
        System.out.println("sebelum di update : "+bahasa);
        bahasa.set(1,"java");
        System.out.println("setelah di update : "+bahasa);
    }
}
