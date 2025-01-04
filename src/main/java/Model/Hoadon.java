package Model;

import java.time.LocalDateTime;

public class Hoadon {
    private String ID_Hoadon;
    private String Ten_Khach_Hang;
    private String Dia_Chi;
    private String So_Dien_Thoai;
    private Double Tong_Tien_Phai_Tra;
    private LocalDateTime Thoi_Gian_Dat_Hang;
    private String Trang_Thai;

    // Constructor không tham số
    public Hoadon() {
    }

    // Constructor có tham số
    public Hoadon(String ID_Hoadon, String Ten_Khach_Hang, String Dia_Chi, String So_Dien_Thoai, Double Tong_Tien_Phai_Tra, LocalDateTime Thoi_Gian_Dat_Hang, String Trang_Thai) {
        this.ID_Hoadon = ID_Hoadon;
        this.Ten_Khach_Hang = Ten_Khach_Hang;
        this.Dia_Chi = Dia_Chi;
        this.So_Dien_Thoai = So_Dien_Thoai;
        this.Tong_Tien_Phai_Tra = Tong_Tien_Phai_Tra;
        this.Thoi_Gian_Dat_Hang = Thoi_Gian_Dat_Hang;
        this.Trang_Thai = Trang_Thai;
    }

    // Getter và Setter cho từng thuộc tính
    public String getID_Hoadon() {
        return ID_Hoadon;
    }

    public void setID_Hoadon(String ID_Hoadon) {
        this.ID_Hoadon = ID_Hoadon;
    }

    public String getTen_Khach_Hang() {
        return Ten_Khach_Hang;
    }

    public void setTen_Khach_Hang(String Ten_Khach_Hang) {
        this.Ten_Khach_Hang = Ten_Khach_Hang;
    }

    public String getDia_Chi() {
        return Dia_Chi;
    }

    public void setDia_Chi(String Dia_Chi) {
        this.Dia_Chi = Dia_Chi;
    }

    public String getSo_Dien_Thoai() {
        return So_Dien_Thoai;
    }

    public void setSo_Dien_Thoai(String So_Dien_Thoai) {
        this.So_Dien_Thoai = So_Dien_Thoai;
    }

    public Double getTong_Tien_Phai_Tra() {
        return Tong_Tien_Phai_Tra;
    }

    public void setTong_Tien_Phai_Tra(Double Tong_Tien_Phai_Tra) {
        this.Tong_Tien_Phai_Tra = Tong_Tien_Phai_Tra;
    }

    public LocalDateTime getThoi_Gian_Dat_Hang() {
        return Thoi_Gian_Dat_Hang;
    }

    public void setThoi_Gian_Dat_Hang(LocalDateTime Thoi_Gian_Dat_Hang) {
        this.Thoi_Gian_Dat_Hang = Thoi_Gian_Dat_Hang;
    }

    public String getTrang_Thai() {
        return Trang_Thai;
    }

    public void setTrang_Thai(String Trang_Thai) {
        this.Trang_Thai = Trang_Thai;
    }
}
