package armawan;
public class Days97 {
    public static double luasSegitiga (double a,double t){
        double hasil = a * t;
        return hasil;
    }
    
    public static void main(String[] args) {
        double alas = 5.5;
        double tinggi = 6.6;
        double result = luasSegitiga(alas,tinggi)*0.5;
        System.out.println("Menghitung Luas Segitiga\nDik : dari alas "+alas+" dan tinggi "+tinggi+"\nhasilnya adalah = "+result);
    }
}
