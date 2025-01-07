
package DAO;

import Model.Sanpham;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class SanphamDAO {
    public List<Sanpham> getAllSanpham(){
        List<Sanpham> DS_Sanpham = new ArrayList<>();
        String query = "SELECT * FROM Sanpham";
        try (Connection conn = DBConnection.getConnection();
	    PreparedStatement ps = conn.prepareStatement(query);
	    ResultSet rs = ps.executeQuery(query)){
            while (rs.next()){
                Sanpham sp = new Sanpham();
                sp.setID_SP(rs.getString("ID_SP"));
                sp.setTen_SP(rs.getString("Ten_SP"));
                sp.setGia(rs.getDouble("Gia"));
                sp.setMo_Ta(rs.getString("Mo_Ta"));
                sp.setAnh(rs.getString("Anh"));
                sp.setLoai_SP(rs.getString("Loai_SP"));
                DS_Sanpham.add(sp);
            }
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DS_Sanpham;
    }
    
}
