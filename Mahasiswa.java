package keyvinjourdan_praktikum6;


public class Mahasiswa {
    public String nama = "Keyvin J";
    public String npm;
    
    private double nilaiUas;
    private double nilaiUts;
    
    //method untuk memasukkan nilaiUas dan nilaiUts
    public void insertNilaiUas(double nilai){
        nilaiUas = nilai;
        }
    public void insertNilaiUts(double nilai){
        nilaiUts = nilai;
    }
    
    //method untuk memanggil nilai yang memiliki akses private
    public void dataMhs(){
        System.out.println("Nama        : " + nama);
        System.out.println("NPM         : " + npm);
        System.out.println("Nilai UAS   : " + nilaiUas);
        System.out.println("Nilai UTS   : " + nilaiUts);
        System.out.println("Nilai Akhir : " + nilaiAkhir());
    }
    
    public double nilaiAkhir(){
        double jumlah = nilaiUts + nilaiUas;
        return jumlah/2;
    }
    
    
}
