package armawan;
import java.util.LinkedList;
public class Days85 {
    public static void main(String[] args) {
        LinkedList <String> rasa = new LinkedList<>();
        rasa.add("manis");
        rasa.add("pahit");
        rasa.add("asin");
        rasa.add("gamon padahal HTS");
        String kandungan = rasa.contains("sakit")?"mengandung rasa":"tidak mengandung rasa";
        System.out.println(kandungan);
    }
}
