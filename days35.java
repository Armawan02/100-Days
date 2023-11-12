package armawan;
import java.util.Scanner;
public class Days35 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte angka;
        System.out.print("Masukkan perulangan while : ");
        angka = input.nextByte();
        //langsung dikondisikan dan nilai awalnya itu tidak hars di ketahui terlebih dahulu
        while(angka <= 10){
            System.out.println(angka);
            angka++;
        }
        System.out.println("perulangan do while");
        // langsung masuk proses tanpa mengecek dulu kondisi baru di proses
        do{
            System.out.println(angka);  
            angka--;
        }while(angka >= 1);
    }

    }
