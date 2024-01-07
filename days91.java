package armawan;
import java.util.LinkedList;
public class Days91 {
  public static void main(String[] args) {
      LinkedList <String> kata = new LinkedList<>();
      kata.add("halo");
      kata.add("friend,");
      kata.add("this is COPAS (Cowok Pas-pasan)");
      rekursi(kata,0);
  }
      private static void rekursi(LinkedList<String> daftarKata, int index) {
        if (index == daftarKata.size()) {
            return;
        }
      System.out.print(daftarKata.get(index)+" ");
      rekursi(daftarKata,index + 1);
  }
}
