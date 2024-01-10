package armawan;
import java.util.HashSet;
public class Days94 {
    
    public static void main(String[] args) {
        HashSet <String> biodata = new HashSet<>();
        biodata.add("Ome");
        biodata.add("Armawan");
        System.out.println("HashSet :\n"+biodata);
        biodata.remove("Ome");
        System.out.println("HashSet setelah pakai remove :\n"+biodata);
        }
    }
