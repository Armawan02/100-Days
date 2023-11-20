package armawan;
import java.util.Scanner;
public class Days43 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        double bb,tb,bmi;
        System.out.print("masukkan berat badan (kg) : ");
        bb = input.nextDouble();
        System.out.print("masukkan tinggi badan (m): ");
        tb = input.nextDouble();
        
        bmi = bb/(tb * tb);
        
        System.out.printf("BMI ANDA : %.2f\n" , bmi);
        if (bmi < 18.5) {                            
             System.out.println("Kurang berat badan ");
        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal ( ideal ) ");
        }else if (bmi >= 25.0 && bmi < 30) {
            System.out.println("kelebihan berat badan");
        }else{
            System.out.println(" anda Kegemukan ( obesitas )");
        }
    }
    
}
