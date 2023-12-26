package armawan;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.Collections;
public class days79 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // menambahkan elemen
        arrayList.add("Apel");
        arrayList.add("Pisang");
        arrayList.add("Jeruk");

        // mendapatkan dan mencetak elemen
        System.out.println("ArrayList: " + arrayList);
        System.out.println("Elemen pada index 1: " + arrayList.get(1));

        // Menetapkan elemen baru
        arrayList.set(1, "Anggur");

        // Ukuran pencetakan dan memeriksa apakah kosong
        System.out.println("ukuran dari ArrayList: " + arrayList.size());
        System.out.println("Apakah ArrayList kosong? " + arrayList.isEmpty());

        // Menemukan indeks suatu elemen
        System.out.println("Index of 'Anggur': " + arrayList.indexOf("Anggur"));

        // memeriksa apakah itu mengandung elemen
        System.out.println("Apakah ArrayList mengandung 'Pisang'? " + arrayList.contains("Banana"));

        // menghapus sebuah elemen
        arrayList.remove("Jeruk");

        // mengkonversi ke array
        String[] array = arrayList.toArray(new String[0]);

        // elemen penyortiran
        Collections.sort(arrayList);

        System.out.println("ArrayList setelah dimodifikasi : " + arrayList);
        
        Vector<String> vector = new Vector<>();

        // menambahkan elemen1
        vector.add("Satu");
        vector.add("Dua");
        vector.add("Tiga");

        // mendapatkan dan mencetak elemen
        System.out.println("Vector: " + vector);
        System.out.println("Elemen dari index 0: " + vector.get(0));

        // Menetapkan elemen baru
        vector.set(0, "Lima");

        // Ukuran pencetakan dan memeriksa apakah kosong
        System.out.println("ukuran dari Vector: " + vector.size());
        System.out.println("Apakah Vector kosong? " + vector.isEmpty());

        // Menemukan indeks suatu elemen
        System.out.println("Index of 'Lima': " + vector.indexOf("Lima"));

        // Memeriksa apakah itu mengandung elemen
        System.out.println("Apakah Vector mengandung 'Dua'? " + vector.contains("Dua"));

        // menghapus sebuah elemen
        vector.remove("Tiga");

        // mengkonversi ke array
        String[] vectorArray = vector.toArray(new String[0]);

        // elemen penyortiran
        Collections.sort(vector);

        System.out.println("Vector setelah di modifikasi: " + vector);
    }
}
