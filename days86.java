package armawan;
import java.util.LinkedList;
public class Days86 {
    public static void main(String[] args) {
        LinkedList<Integer> nomor = new LinkedList<>();
        
        //Menambahkan Data pada Objek nomor
        nomor.add(100);
        nomor.add(200);
        nomor.add(300);
        nomor.add(400);
        nomor.add(500);
        
        //Mencetak/Menampilkan Data
        System.out.println("Index menampilkan elemen nomor : "+nomor);
        
        nomor.offer(600);// menawarkan/menambahkan index,elemen pada akhir list.
        nomor.offerFirst(90);// menawarkan/menambahkan index,elemen pada awal list.
        nomor.offerLast(700);// menawarkan/menambahkan index,elemen pada akhir list,setelah index method offer ditampilkan.
        System.out.println("hasil akhir : "+nomor);
    }
}
