package armawan;
import java.util.LinkedList;
public class Days89 {
    public static void main(String[] args) {
        LinkedList <String> kata = new LinkedList<>();
        kata.add("aku");
        kata.add("kamu");
        kata.add("dia");
        System.out.println("elemen : "+kata);
        // elemen head list akan di hapus dan di kembalikan
        System.out.println("elemen yg akan di hapus pakai poll : "+kata.poll());
        // elemen list pertama akan di hapus dan di kembalikan
        System.out.println("elemen yg akan di hapus pakai pollFirst : "+kata.pollFirst());
        // elemen list terakhir akan di hapus dan di kembalikan
        System.out.println("elemen yg akan di hapus pakai pollLast : "+kata.pollLast());
        // hasil akhir setelah melalui poll(),pollFirst(),dan pollLast().
        System.out.println("hasil akhir : "+kata);
        // jika ketiga fungsi menggunakan program yg berbeda maka akan bisa menampilkan masing² metode penghapusan dan pengembalian elemen,tapi saya menggabungkannya untuk menyederhanakan ketiga fungsi dalam 1 program.
    }
}
