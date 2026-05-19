/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beasiswa.controller;

import beasiswa.dao.BeasiswaDAO;
import beasiswa.model.Penerimaan;
import beasiswa.view.BeasiswaView;
import java.sql.SQLException;
import java.util.List;

public class BeasiswaController {
    private final BeasiswaDAO dao;
    private final BeasiswaView view;
    
    public BeasiswaController(BeasiswaView view){
        this.dao = new BeasiswaDAO();
        this.view = view;
    }
    
    public void tambahData (String nama, String jalur, String nilai_ipkString, String nilai_portofoliosString, String nilai_wawancaraString){
        try {
            validasiInput(nama,nilai_ipkString, nilai_portofoliosString, nilai_wawancaraString );
            int nilai_ipk = integer.parseInt(nilai_ipkString.trim());
            int nilai_portofolio = integer.parseInt(nilai_portofoliosString.trim());
            int nilai_wawancara = integer.parseInt(nilai_wawancaraString.trim());
            validasiNilai(nilai_ipk, nilai_portofolio,nilai_wawancara);
            
            
        }
    }
}
