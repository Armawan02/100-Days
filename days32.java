package armawan;
import java.util.Scanner;
public class Days32 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();
        
        for (int i = angka; i >= 1; i--){
           System.out.println(i);
        }
    }
    
}
