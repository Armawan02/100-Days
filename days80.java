package armawan;
import java.util.LinkedList;
public class Days80 {
    
    public static void main(String[] args){
        //Membuat Instance/Objek dari LinkedList
        LinkedList<String> menti = new LinkedList<>();
        
        //Menambahkan Data pada Objek buah
        menti.add("Awan");
        menti.add("Bahar");
        menti.add("Futri");
        menti.add("Madina");
        menti.add("Rahiman");
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama menti : "+menti);
        
        //Menghitung Jumlah/Ukuran pada Objek LinkedList
        System.out.println("Jumlah menti: "+menti.size());
        menti.addFirst("Ome");//Menambahkan Data pada Index Teratas 
        menti.addLast("Ana");//Menambahkan Data pada Index Tebawah
        
        //Mencetak/Menampilkan Data
        System.out.println("Nama menti: "+menti);
    }
}
