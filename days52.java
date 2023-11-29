package armawan;
import java.util.Scanner;
public class Days52 {
    public static void biodata(){
        Scanner input = new Scanner(System.in);
        String a,b;
        System.out.print("Input Nama Anda = ");
        a = input.nextLine();
        System.out.print("Input Nama Ayah = ");
        b = input.nextLine();
        System.out.println("Nama Anda adalah "+a+", dan anda anak dari "+b);
    }
    public static void main(String[] args) {
        
        biodata();
    }
}
