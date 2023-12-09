package armawan;
public class Days62 {
    public static void main(String[] args) {
        String kata = "Nama : Armawan,Lahir : Lekopadis,Kuliah : UNSULBAR";
        String[] biodata = kata.split(",");
        String kata1 = biodata[0],kata2 = biodata[1],kata3 = biodata[2];
        System.out.println(kata1+"\n"+kata2+"\n"+kata3);
    }
}
