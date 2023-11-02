package armawan;

public class Days25 {
    
    public static void main(String[] args) {
        
        byte nilai1,nilai2,nilai3;
        
        nilai1 = 11;
        nilai2 = 22;
        nilai3 = 33;
        
        boolean hasil1 = nilai1 < nilai2 && nilai1 > nilai3;// false
        boolean hasil2 = nilai3 > nilai1 || nilai2 < nilai1;// true
        boolean hasil3 = hasil1 && hasil2;// false
        
        System.out.println(hasil1+"\n"+hasil2+"\n"+hasil3);
    }
        
}        
        
