package armawan;
import java.util.Scanner;
public class Days31 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        byte angka;
        
        System.out.print("Masukkan angka di bawah 10 = ");
        angka = input.nextByte();
        
        for (byte i =angka; i <= 10;i++) {
           System.out.println(i); 
        }
        
        
    }
    
}
