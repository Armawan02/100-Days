package armawan;
public class Days54 {
    public static void main(String[] args) {
        int hasil=f((byte)6,(byte)5);
        System.out.println("hasil: "+hasil);
    }
    static int f(byte angka1, byte angka2) {
        int hasil;
        hasil = angka1 * angka2 / angka2 + angka1 - angka2;
        // hasil dari a1 x a2 = 30, 30 : a2 = 6, 6 + a1 = 12, 12 - a2 = 7
        return hasil;
    }
}
