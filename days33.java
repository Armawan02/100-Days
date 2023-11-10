package armawan;
import java.util.Scanner;
public class Days33 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka,angka1;
        
        System.out.print("Masukkan angka  = ");
        angka = input.nextInt();
        for (int i = 1; i<= angka;i+=2){
            System.out.println(i);
        }System.out.println("ini adalah angka ganjil\n_________________________");
        System.out.print("Masukkan angka = ");
        angka1 = input.nextInt();
        for (int i =20; i>= angka1;i-=2){
            System.out.println(i);
        }System.out.print("ini adalah angka genap");
    }
    
}
