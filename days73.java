package Days73;
public class outerClass {
    // ini adalah kelas dalam (inner class) pertama
    private class motor {
        private String merk = "YAMAHA SOUL GT";
        private float kecepatan = 115.0f;
        private void balap(){
            System.out.println("merk motor = "+merk+"\nkecepatan motor = "+kecepatan);
        }
    } 
    // kelas dalam juga (inner class) kedua
    private class Pemilik {
        private String nama = "Armawan";
        private int umur = 19;
        private char sim = 'C';
        private void bio(){
            System.out.println("nama = "+nama+"\nusia  = "+umur+"\nSIM = "+sim);
        }
    }
    
    public static void main(String[] args) {
        outerClass outerclass = new outerClass();
        
        outerClass.motor kelas1 = outerclass.new motor();
        outerClass.Pemilik kelas2 = outerclass.new Pemilik();
        System.out.println("Data Kendaraan");
        kelas1.balap();
        System.out.println();
        System.out.println("Data pemilik");
        kelas2.bio();
    }
}
