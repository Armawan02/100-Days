package armawan;
import java.util.Stack;
public class Days92 {
   public static void main(String[] args) {
      Stack stack = new Stack();
      stack.push('A');
      stack.push('R');
      stack.push('M');
      stack.push('A'); 
      stack.push('W');
      stack.push('A');
      stack.push('N');
      System.out.println("elemen di stack: " + stack);
       // mengambil salah satu elemen
      System.out.println("Elemen yg akan di hapus : " + stack.peek());
      stack.pop();
       // hapus elemen yg di ambil
      System.out.println("Setelah hapus : " + stack);
      String cek = (stack.empty())?"elemen kosong":"elemen ada";
       // mengecek elemen apakah kosong atau ada
      System.out.println("apakah elemen kosong : "+cek);
      // elemen terhitung dari bawah ke atas
      System.out.println("elemen yang di cari ke : "+stack.search('M'));
   }
}
