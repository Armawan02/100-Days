package days15;
import java.math.BigInteger;
public class Days15 {
    
    public static void main(String[] args) {
        BigInteger Nominal1,Nominal2,number,number1,number2,number3;
        Nominal1 = new BigInteger("1234567890");
        Nominal2 = new BigInteger("1938373737");
        number = Nominal1.add(Nominal2);// penjumlahan
        number1 = Nominal1.subtract(Nominal2);// pengurangan
        number2 = Nominal1.multiply(Nominal2);// perkalian
        number3 = Nominal1.divide(Nominal2);// pembagian
        System.out.println(number+"\n"+number1+"\n"+number2+"\n"+number3);
        
    }
    
}
