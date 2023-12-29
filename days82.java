package armawan;
import java.util.LinkedList;
public class Days82 {
    public static void main(String[] args){
        LinkedList<String> jamesGosling = new LinkedList<>();
        jamesGosling.add("solve the problem first, then code it.");
       String apakahBenarPernyataanDiAtasKosong = jamesGosling.isEmpty()?"kosong":"tidak kosong";
        System.out.println(apakahBenarPernyataanDiAtasKosong+"\nNilai pada variabel jamesGosling adalah :\n"+jamesGosling);
    }
}
