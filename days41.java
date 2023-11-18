package armawan;
import java.util.Scanner;
public class Days41 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka = 0;
        
        System.out.print("Masukkan angka = ");
        angka = input.nextInt();
        
        if ( angka % 2 == 0){
            System.out.println(angka+2);// angka genap di tambah 2
        }else {
            System.out.println(angka+1);// angka ganjil di tambah 1
        }
        
    }
        }
