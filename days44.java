package armawan;
import java.util.Scanner;
public class Days44 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tugas1,tugas2,tugas3,tugas4,tugas5,rata;
        
        System.out.print("nilai tugas 1\t= ");
        tugas1 = input.nextInt();
        System.out.print("nilai tugas 2\t= ");
        tugas2 = input.nextInt();
        System.out.print("nilai tugas 3\t= ");
        tugas3 = input.nextInt();
        System.out.print("nilai tugas 4\t= ");
        tugas4 = input.nextInt();
        System.out.print("nilai tugas 5\t= ");
        tugas5 = input.nextInt();
        System.out.print("Nilai Rata Rata Anda Adalah...\n");
        rata = (tugas1+tugas2+tugas3+tugas4+tugas5)/5;
        if(rata >= 90 && rata <= 100){
            System.out.println("A");
        }else if(rata >= 80 && rata < 90){
            System.out.println("B");
        }else if(rata >= 70 && rata < 80){
            System.out.println("C");
        }else if(rata >= 60 && rata < 70){
            System.out.println("D");
        }else if(rata < 60) {
            System.out.println("E");
        }
    }
}
