package armawan;
import java.util.LinkedList;
import java.util.Queue;
public class Days93 {
    public static void main(String[] args) {
        
        Queue<String> j = new LinkedList<>();
        j.add("ar");
        j.add("ma");
        j.add("wan");
        
        System.out.println("LinkedList: " + j);
        String pollResult = j.poll();
        System.out.println("Hasil dari poll(): " + pollResult);
        System.out.println("LinkedList setelah poll: " + j);
        j.offer("ome");
        System.out.println("LinkedList setelah offer: " + j);
        System.out.println("elemen pertama : " + j.peek());
        System.out.println("elemen yang di remove : " +j.remove());
        System.out.println("LinkedList hasil akhir : " +j);
    }
}
