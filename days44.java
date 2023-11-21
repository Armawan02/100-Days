package armawan;
import java.util.Scanner;
public class Days44 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilai;
        String hasil;
        System.out.print("masukkan nilai anda : ");
        nilai = input.nextInt();
        hasil = nilai > 100 ? "salah" :
        nilai >= 90 ? "A":
        nilai >= 80 ? "B" :
        nilai >= 70 ? "C":
        nilai >= 60 ? "D":"E";
        System.out.println("nilai anda : "+ hasil);
        
        
    }
    
}
