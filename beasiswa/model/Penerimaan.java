/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beasiswa.model;


public class Penerimaan extends Mahasiswa {
    private int id;
    private float nilai_akhir;
    private String status;
    private static final float BATAS_MINIMUM = 82.5;
    
    public Penerimaan(int id, String nama, String jalur, int nilai_ipk, int nilai_portofolio, int nilai_wawancara){
        super(nama, jalur, nilai_ipk, nilai_portofolio, nilai_wawancara);
        this.id = id;
        this.nilai_akhir = hitungScore();
        this.status = tentukanStatus();
    }
    
    @Override
    public float hitungScore(){
        return (getNilai_ipk()+ getNilai_portofolio()+ getNilai_wawancara())/3.0f;
    }
    
    @Override
    public String tentukanStatus(){
        return hitungScore()>= BATAS_MINIMUM? "DITERIMA": "TIDAK DITERIMA";
    }
    
    public int getId(){return id;}
    public void setId(int id){this.id = id;}
    
    public float getNilai_akhir(){return nilai_akhir;}
    public void setId(float nilai_akhir){this.nilai_akhir = nilai_akhir;}
    
    public String getStatus(){return status;}
    public void setStatus(String status){this.status = status;}
}
