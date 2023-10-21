package days13;

public class Main {
    
    public static void main(String[] args) {
        String Nama,NIM,Alamat,Kelas;
        Nama = "Armawan";
        NIM = "D0223335";
        Alamat = "Malunda";
        Kelas = "Informatika C";
        byte Umur;
        Umur = 19;
        System.out.println("Nama\t:"+Nama+"\n"+"NIM\t:"+NIM+"\n"+"Umur\t:"+Umur+" Thn"+"\n"+"Kelas\t:"+Kelas+"\n"+"Alamat\t:"+Alamat);
    }
    
}

package days13;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int pilihan, P, L, hasil;
        System.out.println("MENGHITUNG LUAS PERSEGI PANJANG");
        System.out.print("masukkan Panjang : ");
        P = masuk.nextInt();
        System.out.print("masukkan Lebar : ");
        L = masuk.nextInt();
        hasil = P * L;
        System.out.println(P+" x "+L+" = "+hasil+" CM");
        
    }
    
}
