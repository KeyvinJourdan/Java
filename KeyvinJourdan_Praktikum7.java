package keyvinjourdan_praktikum7;
import keyvinjourdan_praktikum7.Mahasiswa;

public class KeyvinJourdan_Praktikum7 {


    public static void main(String[] args) {
//        Mahasiswa mhs = new Mahasiswa();
        
//        int result = mhs.sumValue(5,8);
//        System.out.println(result);
//        mhs.printData("Ilmu Komputer");
        
        Mahasiswa mhs2 = new Mahasiswa("Keyvin J", "2117051076", 80,85,88);
        mhs2.printData("Ilmu Komputer");
        
        mhs2.setNama("bukan kj");
        mhs2.setNPM(null);
    }
    
}
