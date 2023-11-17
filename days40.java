package armawan;
import java.util.Scanner;
public class Days40 {
    
    public static void main(String[] args) {

        // membuat variabel belanja dan scanner
        int belanja = 0;
        Scanner scan = new Scanner(System.in);

        // mengambil input
        System.out.print("Total Belanjaan: Rp ");
        belanja = scan.nextInt();

        // cek apakah dia belanja di atas 100000
        if ( belanja < 100000 ) {
            System.out.println("Belanjalah di atas Rp 100000 agar dapat hadiah!");
        } else if ( belanja > 100000){ 
            System.out.println("Selamat, anda mendapatkan hadiah");
        } 

        System.out.println("Terima kasih atas kunjungannya...");

    }

}
