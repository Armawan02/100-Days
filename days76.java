package Days76;
import java.util.ArrayList;
import java.util.Vector;
public class Main {
    
    public static void main(String[] args) {
        ArrayList < Integer> angka = new ArrayList <Integer>();
        angka.add(2);
        angka.add(4);
        angka.add(4);
        for(int i : angka){
            System.out.print(i+" \n");
        }
        Vector <String> text =new Vector<String>();
        text.add("angka di atas adalah code tgl lahir saya");
        text.add(" yaitu : (2 April 2004)");
        for(String a : text){
            System.out.println(a);
            
        }
    }
    
}
