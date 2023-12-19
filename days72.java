package armawan;
public class Main {
    public void joging() {
        System.out.println("saya joging pada pagi hari!");
    }
    public void kecepatan(int laju) {
        System.out.println("jarak tempuh saya : " + laju+" KM");
    }
    // kupanggil method jogging ke method utama di bawah ini
    public static void main(String[] args) {
        Main Saya = new Main(); // ini adalah objek
        Saya.joging();           // panggil method jogging
        Saya.kecepatan(7);     // panggil method kecepatan
    }
}
