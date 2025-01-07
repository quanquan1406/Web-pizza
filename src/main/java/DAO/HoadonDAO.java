package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Model.Hoadon;

public class HoadonDAO {

    // Phương thức lấy tất cả thông tin từ bảng Hoadon
    public List<Hoadon> GetAllHoadon() {
        List<Hoadon> hoadonList = new ArrayList<>();
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            // Kết nối cơ sở dữ liệu
            conn = DBConnection.getConnection();

            // Câu lệnh SQL để lấy tất cả dữ liệu từ bảng Hoadon
            String sql = "SELECT * FROM Hoadon";

            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            // Duyệt qua từng bản ghi trong ResultSet
            while (rs.next()) {
                Hoadon hoadon = new Hoadon();

                // Gán giá trị từ ResultSet vào đối tượng Hoadon
                hoadon.setID_Hoadon(rs.getString("ID_Hoadon"));
                hoadon.setTen_Khach_Hang(rs.getString("Ten_Khach_Hang"));
                hoadon.setDia_Chi(rs.getString("Dia_Chi"));
                hoadon.setSo_Dien_Thoai(rs.getString("So_Dien_Thoai"));
                hoadon.setTong_Tien_Phai_Tra(rs.getDouble("Tong_Tien_Phai_Tra"));
                hoadon.setThoi_Gian_Dat_Hang(rs.getTimestamp("Thoi_Gian_Dat_Hang").toLocalDateTime());
                hoadon.setTrang_Thai(rs.getString("Trang_Thai"));

                // Thêm đối tượng Hoadon vào danh sách
                hoadonList.add(hoadon);
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

        return hoadonList;
    }
}