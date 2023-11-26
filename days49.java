package armawan;
import java.util.Scanner;
public class Days49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kondisi cuaca (Cerah/Hujan/Mendung): ");
        String cuaca = input.next().toLowerCase();

        String aktivitas;

        switch (cuaca) {
            case "cerah":
                aktivitas = "Main bola di lapangan";
                break;
            case "hujan":
                aktivitas = "Nonton One Piece";
                break;
            case "mendung":
                aktivitas = "Pergi kewarung minum kopi";
                break;
            default:
                aktivitas = "Tidak ada dalam pilihan";
                break;
        }

        System.out.println("Jika cuaca " + cuaca + ", maka Anda bisa " + aktivitas);
    }
}
