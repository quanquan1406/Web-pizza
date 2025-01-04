package Model;

public class Giohang {
    private String ID_Giohang;
    private String ID_Hoadon;
    private String ID_KH;
    private String ID_SP;
    private Double Gia;
    private int So_Luong;
    private Double Tong_Tien;

    // Constructor không tham số
    public Giohang() {
    }

    // Constructor có tham số
    public Giohang(String ID_Giohang, String ID_Hoadon, String ID_KH, String ID_SP, Double Gia, int So_Luong, Double Tong_Tien) {
        this.ID_Giohang = ID_Giohang;
        this.ID_Hoadon = ID_Hoadon;
        this.ID_KH = ID_KH;
        this.ID_SP = ID_SP;
        this.Gia = Gia;
        this.So_Luong = So_Luong;
        this.Tong_Tien = Tong_Tien;
    }

    // Getter và Setter cho từng thuộc tính
    public String getID_Giohang() {
        return ID_Giohang;
    }

    public void setID_Giohang(String ID_Giohang) {
        this.ID_Giohang = ID_Giohang;
    }

    public String getID_Hoadon() {
        return ID_Hoadon;
    }

    public void setID_Hoadon(String ID_Hoadon) {
        this.ID_Hoadon = ID_Hoadon;
    }

    public String getID_KH() {
        return ID_KH;
    }

    public void setID_KH(String ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getID_SP() {
        return ID_SP;
    }

    public void setID_SP(String ID_SP) {
        this.ID_SP = ID_SP;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public int getSo_Luong() {
        return So_Luong;
    }

    public void setSo_Luong(int So_Luong) {
        this.So_Luong = So_Luong;
    }

    public Double getTong_Tien() {
        return Tong_Tien;
    }

    public void setTong_Tien(Double Tong_Tien) {
        this.Tong_Tien = Tong_Tien;
    }
}
