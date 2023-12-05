package armawan;
import java.util.Scanner;
public class Days58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nama;
        System.out.println("input nama anda dengan huruf kapital..!");// input nama bebas mau kapital di awal atau akhir,bahkan dengan huruf kapital semua.
        System.out.print("masukkan nama = ");// tempat input nama anda.
        nama = input.nextLine();
        
        System.out.println("~~~~~~~~~~~~~~~~~~~\n"+nama.toLowerCase()+" (konversi sukses)");// proses konversi huruf kapital jadi kecil di lower case.
    }
}
