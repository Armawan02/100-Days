package armawan;
import java.util.Scanner;
public class Days59 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String kue;
        System.out.print("Masukkan Nama Kue = ");
        kue = i.nextLine();
        System.out.println("~~~~~~~~~~~~~~~~~~~\n"+kue+" ×\n"+kue.toUpperCase()+" √");
    }
}
