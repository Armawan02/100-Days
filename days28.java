package armawan;
import java.util.Scanner;
public class Days28 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte angka;
        
        System.out.print("masukkan angka : ");
        angka = input.nextByte();
        if (angka >= 20){
            System.out.println("angka di atas 20");
        } else if (angka <= 20 ){
            System.out.println("angka di bawah 20");
        }else {
            System.out.println("angka terserah");
        }
    }
    
}
