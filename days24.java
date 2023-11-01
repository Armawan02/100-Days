package armawan;

public class Days24 {
    
    public static void main(String[] args) {
        
        byte A,B;
        boolean a1,a2,a3,a4,a5,a6;
        A = 13;
        B = 10;
        
        a1 = A == B;// false
        a2 = (A != B);// true
        a3 = (A > B);// true
        a4 = (A < B);// false
        a5 = (A >= B);// true
        a6 = (A <= B);// false
        
        System.out.println(a1+"\n"+a2+"\n"+a3+"\n"+a4+"\n"+a5+"\n"+a6);
    }
    
}
