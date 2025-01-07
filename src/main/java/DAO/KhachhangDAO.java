package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.Khachhang;

public class KhachhangDAO {
	public List<Khachhang> getAllKhachhang() {
		List<Khachhang> DS_Khachhang = new ArrayList<>();
		String query = "SELECT * FROM Khachhang";
		try (Connection conn = DBConnection.getConnection();
	        PreparedStatement ps = conn.prepareStatement(query);
	        ResultSet rs = ps.executeQuery()) {
			while (rs.next()) {
				Khachhang kh = new Khachhang();
				kh.setID_KH(rs.getString("ID_KH"));
				kh.setTen_Khach_Hang(rs.getString("Ten_Khach_Hang"));
				kh.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
				kh.setDia_Chi(rs.getString("Dia_Chi"));
                kh.setTai_Khoan(rs.getString("TAI_KHOAN"));
                kh.setMat_Khau(rs.getString("MAT_KHAU"));
                DS_Khachhang.add(kh);
			}
		}catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
		return DS_Khachhang;
		
	}
}
