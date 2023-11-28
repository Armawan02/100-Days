package armawan;
import java.util.Scanner;
public class Days51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Username : ");
        String user = input.nextLine();
        System.out.print("Password : ");
        String pass = input.nextLine();
        if (user.equals("Armawan") && pass.equals("Armawan")){
            System.out.println("Login Sukses");
        }else {
            System.out.println("Login Gagal");
        }
    }
}
