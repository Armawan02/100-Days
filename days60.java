package armawan;
import java.util.Scanner;
public class Days60 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        String kata;
        System.out.print("Masukkan kata = ");
        kata = i.nextLine();
        
       		if(kata.contains("Bismillah")) {
			       System.out.println("true, karena karakter "+kata+" sama pada nilai di dalam contains");
		} else {
			       System.out.println("false, karena karakter "+kata+" tidak sama pada nilai di dalam contains");
		    }
  	}
}
