package armawan;
import java.util.LinkedList;
public class Days81 {
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<Integer> nomor = new LinkedList<>();
        
        //Menambahkan Data pada Objek nomor
        nomor.add(11);
        nomor.add(22);
        nomor.add(33);
        nomor.add(44);
        nomor.add(55);
        
        //Mencetak/Menampilkan Data
        System.out.println("Index data nomor : "+nomor);
        
        nomor.remove();
        nomor.remove(1);//hapus Data pada Index Teratas 
        nomor.removeFirst();//hapus Data pada Index Tebawah
        nomor.removeLast();
        System.out.println("hasil akhir : "+nomor);
    }
}
/* Data pada index 1 terhapus karena menggunakan removeFirst()
Data pada index 2 terhapus karena remove(1)
Data pada index 3 terhapus karena remove()
Data pada index 5 terhapus karena removeLast()
Jadi yang tersisa adalah index 4 (44)*/
