package armawan;
import java.util.Scanner;
public class Days69 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nama;
        System.out.print("Input Nama = ");
        nama = in.nextLine();
         String kata = (isPalindrome(nama))?"palindrome":"bukan palindrome";
        System.out.print(kata);
    }
    private static boolean isPalindrome( String hsp) {
        return hsp.equalsIgnoreCase(new StringBuilder(hsp).reverse().toString());
    }
}
