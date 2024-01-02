package armawan;
import java.util.LinkedList;
public class Days87 {
    public static void main(String[] args) {
        LinkedList<String> hari = new LinkedList<>();
        
        // daftar elemen hari senin-minggu
        hari.add("senin");
        hari.add("selasa");
        hari.add("rabu");
        hari.add("kamis");
        hari.add("jumat");
        hari.add("sabtu");
        hari.add("minggu");
        System.out.println("LinkedList awal : "+hari+"\n");
            
        // menyisipkan elemen baru pada bagian depan daftar
        hari.push("Ahad");
        System.out.println("penambahan elemen bagian depan daftar :\n"+hari+"\n");
        
        // menghapus elemen pada bagian depan daftar
        System.out.println("elemen yang akan di hapus : "+hari.pop()+"\n");
        System.out.println("LinkedList akhir : "+hari);
    }
}
