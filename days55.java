package armawan;
public class Days55 {
    public static void main(String[] args) {
        Days55 input = new Days55();
        String nama = "armawan";
        int angka = input.jumlahHuruf(nama);
        System.out.println("nama anda = "+nama);
        System.out.println("jumlah huruf pada nama anda = "+angka);  
    }
    public static int jumlahHuruf(String oct){
        return oct.length();
    }
}
