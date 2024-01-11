package armawan;
import java.util.HashMap;
public class Days95 {
    
    public static void main(String[] args) {
        HashMap <Integer,String> namaMenti = new HashMap <Integer,String>();
        
        namaMenti.put(1,"Armawan");
        namaMenti.put(2,"Baharuddin");
        namaMenti.put(3,"Futri Adriana Aksar");
        namaMenti.put(4,"Nur Rahiman");
        namaMenti.put(5,"Nurmadinah");
        
        System.out.println("isi objek nama menti : "+namaMenti);
        System.out.println("nama menti Pertama : "+namaMenti.get(1));
    }
}
