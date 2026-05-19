/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beasiswa.dao;

import beasiswa.model.Penerimaan; 
import java.sql.SQLException;
import java.util.List;
        
public interface IBeasiswaDAO {
    void create(Penerimaan penerimaan) throws   SQLException;
    List<Penerimaan>readAll()throws SQLException;
    void update(Penerimaan penerimaan) throws SQLException;
    void delete (int id) throws     SQLException;
}
