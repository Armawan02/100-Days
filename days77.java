package Days77;
import java.util.ArrayList;
import java.util.Vector;
public class Main {
    
    public static void main(String[] args) {
        ArrayList < String > mama= new ArrayList <String>();
        mama.add("Aku ke mama : ");
        mama.add("1. ma, mauka makan");
        mama.add("2. ma, minta ka uang");
        mama.add("3. ma, kotor bajuku");
        mama.add("4. ma, keluarka sama temanku");
        for(String  i: mama){
            System.out.println(i);
        }
        Vector < String> papa=new Vector<String>();
        papa.add("Aku ke bapak : ");
        papa.add("1. pa, dimana mama?");
        for(String a : papa){
            System.out.println(a);
            
        }
    }
    
}
