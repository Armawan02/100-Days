package armawan;
import java.util.Scanner;
public class Days66 {
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        String namaDepan,namaBelakang,hasil;
        System.out.print("Masukkan Nama Depan = ");
        namaDepan = in.nextLine();
        System.out.print("Masukkan Nama Belakang = ");
        namaBelakang = in.nextLine();
         hasil=String.format("Halo, %s %s!", namaDepan, namaBelakang);
        System.out.println(hasil);
    }
} 
