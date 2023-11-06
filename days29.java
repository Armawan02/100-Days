package armawan;
import java.util.Scanner;
public class Days29 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();
        String kata = (angka > 10)?"Angka lebih besar dari 10":"Angka lebih kecil dari 10";
        System.out.println(kata);
        
    }
    
}       // operator ternary
        /* jika angka di atas 10, maka yang muncul adalah "Angka lebih besar dari 10".
           jika angka di bawah 10, maka yang muncul adalah "Angka lebih kecil dari 10".*/
        
