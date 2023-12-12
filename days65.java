package armawan;
import java.util.Scanner;
public class Days65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1,str2, hasil;
        System.out.print("Masukkan String Pertama = ");
        str1 = in.nextLine();
        System.out.print("Masukkan String Kedua = ");
        str2 = in.nextLine();
        hasil = (str1.equalsIgnoreCase(str2))?"Kedua String sama":"Kedua String berbeda";
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~\n"+hasil);
    }
}
