package armawan;
import java.util.Scanner;
public class Days21 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String kalimat;
        byte usia;
        
        System.out.print("masukkan nama lengkap anda : ");
        kalimat = input.nextLine();
        System.out.print("masukkan  usia anda : ");
        usia = input.nextByte();
        
        System.out.println("______________________________________");
        System.out.println("Nama anda adalah = "+kalimat+"\nUsia anda adalah = "+usia+" thn");
    }
    
}
