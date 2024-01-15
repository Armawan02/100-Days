package armawan;
public class Days100 {
    public static void main(String[] args) {
        System.out.println("HASIL DARI OPERATOR ARITMATIKA, PENUGASAN\nPERBANDINGAN,DAN LOGIKA");
        int a,b,c,d,e,x = 9, y = 6;
        a = x + y;
        b = x - y;
        c = x * y;
        d = x / y;
        e = x % y;
        System.out.println("\nOperator Aritmatika :\n"+x+" + "+y+" = "+a+"\n"+x+" - "+y+" = "+b+"\n"+x+" x "+y+" = "+c+"\n"+x+" : "+y+" = "+d+"\n"+x+" % "+y+" = "+e);
        System.out.println("\nOperator Penugasan :\nnilai x = "+x+"\nnilai y = "+y);
        x += y;
        System.out.println("hasil setelah penambahan : "+x);
        x -= y;
        System.out.println("hasil setelah pengurangan : "+x);
        x *= y;
        System.out.println("hasil setelah perkalian : "+x);
        x /= y;
        System.out.println("hasil setelah pembagian : "+x);
        x %= y;
        System.out.println("hasil setelah sisa bagi : "+x);
        System.out.println("\nOperator Perbandingan :\nnilai x = "+x+"\nnilai y = "+y);
        boolean hasil;
        // di sini nilai x jadi = 3 karena dari hasil akhir operator penugasan.
        hasil = x > y;
        System.out.println(x+" > "+y+" = "+hasil);
        hasil = x < y;
        System.out.println(x+" < "+y+" = "+hasil);
        hasil = x >= y;
        System.out.println(x+" >= "+y+" = "+hasil);
        hasil = x <= y;
        System.out.println(x+" <= "+y+" = "+hasil);
        hasil = x == y;
        System.out.println(x+" == "+y+" = "+hasil);
        hasil = x != y;
        System.out.println(x+" != "+y+" = "+hasil);
        System.out.println("\nOperator Logika :\nnilai x = "+x+"\nnilai y = "+y);
        String And = (x < y && x > y)?"benar":"salah";
        System.out.println("x > y && x > y hasil = "+And);
        String Or = (x < y || x > y)?"benar":"salah";
        System.out.println("x > y || x > y hasil = "+Or);
        String Negasi = (x < y != x > y)?"benar":"salah";
        System.out.println("x > y != x > y hasil = "+Negasi);
    }
}
