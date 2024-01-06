package armawan;
import java.util.LinkedList;
public class Days90 {
    public static void main(String[] args) {
        LinkedList <String> kata = new LinkedList<>();
        kata.add("aku");
        kata.add("kamu");
        kata.add("dia");
        System.out.println("elemen : "+kata);
        // elemen head list akan di hapus 
        System.out.println("elemen yg akan di hapus pakai remove: "+kata.remove());
        // elemen list pertama akan di hapus 
        System.out.println("elemen yg akan di hapus pakai removeFirst : "+kata.removeFirst());
        // elemen list terakhir akan di hapus 
        System.out.println("elemen yg akan di hapus pakai removeLast : "+kata.removeLast());
        // hasil akhir setelah melalui remove(),removeFirst(),dan removeLast().
        System.out.println("hasil akhir : "+kata);
        // jika ketiga fungsi menggunakan program yg berbeda maka akan bisa menampilkan masing² metode penghapusan dan pengembalian elemen,tapi saya menggabungkannya untuk menyederhanakan ketiga fungsi dalam 1 program.
    }
}
