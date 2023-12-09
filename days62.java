package armawan;
public class Days62 {
    public static void main(String[] args) {
        String biodata = "Nama\t: Armawan,Lahir\t: Lekopadis,Kuliah\t: UNSULBAR";
        String[] kata = biodata.split(",");
        
        
        String kata1 = kata[0],kata2 = kata[1],kata3 = kata[2];
        System.out.println(kata1+"\n"+kata2+"\n"+kata3);
    }
}
