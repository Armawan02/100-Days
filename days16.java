package days16;
import java.math.BigDecimal;
public class Days16 {
    
    public static void main(String[] args) {
        
        BigDecimal angka1 = new BigDecimal("10.0");
        BigDecimal angka2 = new BigDecimal("20.0");
        BigDecimal angka3 = new BigDecimal("30.0");
        BigDecimal angka4 = new BigDecimal("40.0");
        
        BigDecimal penjumlahan,pengurangan,perkalian,pembagian;
        penjumlahan = angka1.add(angka2);
        pengurangan = angka1.subtract(angka2);
        perkalian = angka1.multiply(angka3);
        pembagian = angka1.divide(angka4);
        
        
        System.out.print("Nilai\t:"+penjumlahan);
    }
    
}
