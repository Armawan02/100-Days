package armawan;
import java.util.Scanner;
public class Days42 {
    
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int P,L,KLL;
        
        System.out.println("Menghitung Luas Persegi Panjang\n");
        System.out.print("Masukkan Panjang =");
        P = keyboard.nextInt();
        System.out.print("Masukkan Lebar =");
        L = keyboard.nextInt();
        
        KLL = P * L;
        System.out.println("Luas Keliling "+P+" x "+L+" = "+KLL+"\n");
        System.out.println("Jadi Luas Persegi Panjang adalah "+KLL+" CM");
    }
    
}
