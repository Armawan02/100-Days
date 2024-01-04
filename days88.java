package armawan;
import java.util.LinkedList;
public class Days88 {
    public static void main(String[] args) {
       LinkedList <String> kata = new LinkedList<>();
        kata.add("aku");
        kata.add("kamu");
        kata.add("dia");
        System.out.println("LinkedList :\n");
        for (String a : kata){
        System.out.println(a);
        }
        System.out.println("\nmengecek elemen kepala : "+kata.peek());
        System.out.println("mengecek elemen pertama : "+kata.peekFirst());
        System.out.println("mengecek elemen terakhir : "+kata.peekLast());
        
        // jadi fungsi dari peek adalah mengambil elemen kepala (elemen pertama)tanpa menghapus elemen pada list.
    }
}
