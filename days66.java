package armawan;
import java.util.Scanner;
public class Days66 {
    public static void main(String args[]){ 
        Scanner in = new Scanner(System.in);
        String nama,hasil;
        int umur;
        System.out.print("Masukkan Nama Anda = ");
        nama = in.nextLine();
        System.out.print("Masukkan umur Anda = ");
        umur = in.nextInt();
         hasil=String.format("nama anda adalah %s, dan anda berusia %d",nama,umur);
        System.out.println(hasil);
    }
} 
