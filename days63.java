package armawan;
import java.util.Scanner;
public class Days63 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama;
        System.out.print("Masukkan Nama = ");
        nama = in.nextLine();
       String  kata = (nama.equals("Armawan"))? "true":"false";
        System.out.println(kata);
    }
}
