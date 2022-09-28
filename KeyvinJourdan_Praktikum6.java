package keyvinjourdan_praktikum6;

import keyvinjourdan_praktikum6.Mahasiswa;
public class KeyvinJourdan_Praktikum6 {

    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nama = "Keyvin Jourdan";
        mhs1.npm = "2117051076";
        
        System.out.println("Nama :" + mhs1.nama);
        System.out.println("NPM  :" + mhs1.npm);
        
        // karena nilai uas dan uts memiliki akses private, maka tidak bisa di run atau dijalankan di class lain
        
        mhs1.insertNilaiUas(86);
        mhs1.insertNilaiUts(90);
        
        
        //memanggil method yang telah dibuat untuk memanggil nilaiUas dan nilaiUts yang memiliki akses 
        mhs1.dataMhs();
        
    }
    
}
