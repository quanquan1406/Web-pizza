package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Giohang;

public class GiohangDAO {

    // Phương thức lấy tất cả thông tin từ bảng Giohang
    public List<Giohang> GetAllGiohang() {
        List<Giohang> giohangList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Kết nối cơ sở dữ liệu
            conn = DBConnection.getConnection();

            // Câu lệnh SQL để lấy tất cả dữ liệu từ bảng Giohang
            String sql = "SELECT * FROM Giohang";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Duyệt qua từng bản ghi trong ResultSet
            while (rs.next()) {
                Giohang giohang = new Giohang();

                // Gán giá trị từ ResultSet vào đối tượng Giohang
                giohang.setID_Giohang(rs.getString("ID_Giohang"));
                giohang.setID_Hoadon(rs.getString("ID_Hoadon"));
                giohang.setID_KH(rs.getString("ID_KH"));
                giohang.setID_SP(rs.getString("ID_SP"));
                giohang.setGia(rs.getDouble("Gia"));
                giohang.setSo_Luong(rs.getInt("So_Luong"));
                giohang.setTong_Tien(rs.getDouble("Tong_Tien"));

                // Thêm đối tượng Giohang vào danh sách
                giohangList.add(giohang);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Đóng kết nối và các tài nguyên
            try {
                if (rs != null) rs.close();
                if (pstmt != null) pstmt.close();
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return giohangList;
    }
}
