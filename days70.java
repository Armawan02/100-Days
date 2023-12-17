package armawan; // Program pertama
public class Main {
    String nama,nim;
    int umur;
    
    public void hasil(){
        System.out.println("nama = "+nama);
        System.out.println("nim = "+nim);
        System.out.println("umur = "+umur);
    }
}
    
/*membuat class baru untuk menampung data (nama, nim, & umur).
selanjutnya mengisi data tersebut di method main dan memanggil 
data dari class yang dibuat  sebelumnya.*/

package armawan; // Program kedua
public class dataData {
    public static void main(String[] args) {
        Main dataData = new Main();
        dataData.nama = "Armawan";
        dataData.nim = "D0223335";
        dataData.umur = 19;
        dataData.hasil();
    }   
}
