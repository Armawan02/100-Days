package armawan;
import java.util.Arrays;
public class Days47 {
    
    public static void main(String[] args) {
        
        System.out.println("Soal 1 : Membuat Nama hewan dengan 10 indeks di array");
        String [] hewan ={"sapi ","kambing ","kerbau ","gajah ","jerapah ","rusa ","badak ","kuda ","keledai ","kangguru"};
        for(int i =0 ; i < hewan.length; i++){
            System.out.println("indeks ke "+i +" = "+hewan[i]);
        }
        System.out.println("\nSoal 2 : Membuat penjumlahan di array");
        int [] angka = {1,3,5,7,9,11,13,15,17,19};
        System.out.println("Menampilkan angka ganjil \n"+Arrays.toString(angka));
        int jumlah = 0;
        for ( int hasil : angka){
            jumlah += hasil;
        }
        System.out.println("\nHasil = jumlah nilai dalam array = "+jumlah);   
   }
}
