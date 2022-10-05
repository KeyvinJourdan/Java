
package keyvinjourdan_praktikum7;

public class Mahasiswa {
    private String nama;
    private String npm;
    private double nilaiTugas;
    private double nilaiUas;
    private double nilaiUts;
    private double NA;
    
    //this.nama / this.npm untuk memanggil atribut yg ada di class mahasiswaa
    public void printData(String jurusan){
    System.out.println("NPM\t : " + this.getNpm());
    System.out.println("Nama\t: " + this.getNama());
    System.out.println("Jurusan\t: " + jurusan);
    }
    
    public int sumValue(int x, int y){
        return x+y;
    }
    
    public void hitungNA(){
        this.setNA((this.getNilaiTugas() * 0.3) + (this.getNilaiUts() * 0.35) + (this.getNilaiUas() * 0.35));
    }
    
    public void hitungNA(double nilaiTugas, double nilaiUts, double nilaiUas){
        this.setNA((nilaiTugas*0.3) + (nilaiUts*0.35) + (nilaiUas*0.35));
    }
    
    public void hitungNA(String pesan){
        System.out.println("Nilai tidak valid");
    }
    
    
    public Mahasiswa(String nama, String npm, double nilaiTugas, double nilaiUas, double nilaiUts){
    this.nama = nama;
    this.npm = npm;
    this.nilaiTugas = nilaiTugas;
    this.nilaiUts = nilaiUts;
    this.nilaiUas = nilaiUas;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return nama;
    }
    public void setNPM(String npm){
        this.setNpm(npm);
    }
    
    public String getNPM(){
        return getNpm();
    }
    
    public void setNilaiTugas(double nilaiTugas){
        this.nilaiTugas = nilaiTugas;
    }
    
    public double getNilaiTugas(){
        return nilaiTugas;
    }
    
    public void setNilaiUts(double nilaiUts){
        this.nilaiUts = nilaiUts;
    }
    
    public double getNilaiUts(){
        return nilaiUts;
    }
    
    public void setnilaiUas(double nilaiUas){
        this.setNilaiUas(nilaiUas);
    }
    
    public double getnilaiUas(){
        return getNilaiUas();
    }
    
    public void setNA(double NA){
        this.NA = NA;
    }
    
    public double getNA(){
        return NA;
    }

    /**
     * @return the npm
     */
    public String getNpm() {
        return npm;
    }

    /**
     * @param npm the npm to set
     */
    public void setNpm(String npm) {
        this.npm = npm;
    }

    /**
     * @return the nilaiUas
     */
    public double getNilaiUas() {
        return nilaiUas;
    }

    /**
     * @param nilaiUas the nilaiUas to set
     */
    public void setNilaiUas(double nilaiUas) {
        this.nilaiUas = nilaiUas;
    }
    
}

