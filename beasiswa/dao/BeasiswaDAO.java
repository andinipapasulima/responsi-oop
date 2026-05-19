/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beasiswa.dao;

import beasiswa.database.DBConnection;
import  beasiswa.model.Penerimaan;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BeasiswaDAO implements IBeasiswaDAO{
    @Override
    public void create (Penerimaan penerimaan) throws SQLException{
        String sql = "INSERT INTO penerimaan (nama, jalur, nilai_ipk, nilai_portofolio, nilai_wawancara, nilai_akhir, status)"+ "VALUES (?,?,?,?,?,?,?)";
        try (Connection conn = DBConnection.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)){
            ps.setString(1, penerimaan.getNama());  
            ps.setString(2, penerimaan.getJalur()); 
            ps.setInt(3, penerimaan.getNilai_ipk()); 
            ps.setInt(4, penerimaan.getNilai_portofolio()); 
            ps.setInt(5, penerimaan.getNilai_wawancara()); 
            ps.setFloat(6, penerimaan.getNilai_akhir()); 
            ps.setString(7, penerimaan.getStatus());
            ps.executeUpdate();
        }
    }
    
    @Override
    public List<Penerimaan> readAll() throws SQLException{
        List<Penerimaan>list = new ArrayList<>();
        String sql = "SELECT * FROM penerimaan";
        try (Connection conn = DBConnection.getConnection(); Statement st = conn.createStatement(); ResultSet rs = st.executeQuery(sql)){
        
        while (rs.next()){
            Penerimaan p = new  Penerimaan (
            rs.getInt("id"),
            rs.getString("nama"),
            rs.getString("jalur"),
            rs.getInt("nilai_ipk"),
            rs.getInt("nilai_portofolio"),
            rs.getInt("nilai_waancara")
            );
            list.add(p);
        }
    }
        return list;
}
    @Override
    public void update (Penerimaan penerimaan) throws SQLException{
        String sql = "UPDATE penerimaan SET nama=?, jalur=?, nilai_ipk=?, nilai_portofolio=?," + "nilai_wawancara=?, nilai_akhir=?, status=?, WHERE id=?";
        
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, penerimaan.getNama());  
            ps.setString(2, penerimaan.getJalur()); 
            ps.setInt(3, penerimaan.getNilai_ipk()); 
            ps.setInt(4, penerimaan.getNilai_portofolio()); 
            ps.setInt(5, penerimaan.getNilai_wawancara()); 
            ps.setFloat(6, penerimaan.getNilai_akhir()); 
            ps.setString(7, penerimaan.getStatus());
            ps.executeUpdate();
        }
    }
    
    @Override
    public void delete(int id) throws  SQLException{
        String sql = "DELETE FROM penerimaan WHERE id=?";
        try (Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}

