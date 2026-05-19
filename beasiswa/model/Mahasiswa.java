/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beasiswa.model;


public abstract class Mahasiswa {
    private String nama;
    private String jalur;
    private int nilai_ipk;
    private int nilai_portofolio;
    private int nilai_wawancara;
    
    public Mahasiswa (String nama, String jalur, int nilai_ipk, int nilai_portofolio, int nilai_wawancara){
        this.nama = nama;
        this.jalur = jalur;
        this.nilai_ipk = nilai_ipk;
        this.nilai_portofolio = nilai_portofolio;
        this.nilai_wawancara = nilai_wawancara;
    }
    
    public abstract float hitungScore();
    public abstract String tentukanStatus();
    
    public String getNama(){return nama;}
    public void setJalur(String jalur) {this.jalur = jalur;}
    
    public int getNilai_ipk(){return nilai_ipk;}
    public void setNilai_ipk(int nilai_ipk){this.nilai_ipk = nilai_ipk;}
    
    public int getNilai_portofolio(){return nilai_portofolio;}
    public void setNilai_portofolio(int portofolio){this.nilai_portofolio = nilai_portofolio;}
    
    public int getNilai_wawancara(){return nilai_wawancara;}
    public void setNilai_wawancara(int nilai_wawancara){this.nilai_wawancara = nilai_wawancara;}
}
