package armawan;
import java.util.Scanner;
public class Days64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("MEMBUAT DIAMOND BOCIL EPEP\n\nmasukkan jumlah baris = ");
        int baris = scanner.nextInt();
        int s = baris-1;
        int b =1;
        // shaf tengah ke atas
        System.out.println("\n");
        for (int i =1; i <= baris;i++) {
            for (int j = 1; j <= s;j++) {
                System.out.print(" ");}  
            for (int k =1; k <= b;k++) {
                System.out.print("*");}
            System.out.println();
            s--;
            b +=2;
        }
        // shaf tengah kebawah
        s =1;
        b = baris * 2-3;
        for (int i =1; i <= baris -1; i++) {
            for (int j =1; j <= s;j++) {
                System.out.print(" ");}
            for (int k =1; k <= b;k++) {
                System.out.print("*");}
            System.out.println();
            s++;
            b -=2;
        }
    }
}
