package armawan;
public class Main {
     public String nama,nim;
    public int umur;
    
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNim(){
        return nim;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public int getUmur(){
        return umur;
    }
    public void setUmur(int umur){
        this.umur = umur;
    }
}

package armawan;
public class dataData {
    public static void main(String[] args) {
        Main dataData = new Main();
        dataData.setNama("Armawan");
        System.out.println(dataData.getNama());
        dataData.setNim("D0223335");
        System.out.println(dataData.getNim());
        dataData.setUmur(19);
        System.out.println(dataData.getUmur());
    }
}
