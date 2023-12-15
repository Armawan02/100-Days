package armawan;
import java.util.*;
public class Days68 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String kata;
        System.out.print("Masukkan kata = ");
        kata = in.nextLine();
        String r= new StringBuilder(kata).reverse().toString();
        System.out.println("reverse = "+r+"\nkembali ke String awal = "+kata);
    }
}
