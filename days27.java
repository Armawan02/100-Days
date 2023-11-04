package armawan;
import java.util.Scanner;
public class Days27 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int nilai;
        
        System.out.println("Masukkan Nilai UTS Anda");
        nilai = input.nextInt();
        if (nilai >= 74 ) {
            System.out.println("Anda Tuntas");
            
        }else 
        System.out.println("Anda tidak Tuntas");
        
    }
    
}
