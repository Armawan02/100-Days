package armawan;
import java.util.ArrayList;
import java.util.Vector;

public class days78 {
    public static void main(String[] args) {
        ArrayList<Coding> koding = new ArrayList<>();
        koding.add(new Coding("INFORMATICS STUDY CLUB",100));
        System.out.println("ArrayList bertipe class Coding");
        for (Coding data : koding) {
            System.out.println("NAMA ORGANISASI : " + data.getA() + "\nJUMLAH HARI MENTORING : " + data.getB()+" hari");
        }
        System.out.println();
        Vector<Coding> vector= new Vector<>();
        vector.add(new Coding("Java Script",2023));
        System.out.println("Vektor bertipe class Coding");
        for (Coding data : vector) {
            System.out.println("Bahasa Pemprograman : " + data.getA() + "\ntahun : " + data.getB());
        }
    }
}
class Coding {
    private String a;
        private int b;
  
    public Coding(String a, int b) {
        this.a= a;
        this.b = b;
    }
    public String getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    }
