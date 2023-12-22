package armawan;
import java.util.ArrayList;
import java.util.Vector;
public class Main {
       public static void main(String[] args) {
           ArrayList <Object> a = new ArrayList<>();
           Vector <Object> v = new Vector<>();
           
           a.add("Nama\t: Armawan");
           a.add("Usia\t: "+19);
           a.add("Alamat\t: Mekkatta");;
           System.out.println("ArrayList :\n");
           for(Object arraylist : a){
               System.out.println(arraylist);
           }
           System.out.println("\nVektor :\n");
           v.add("Tinggi\t= "+165.0f);
           v.add("Berat\t= "+50.0);
           v.add("G-Darah\t= "+'A');
           for(Object vektor : v){
               System.out.println(vektor);
           }
       }
   }
