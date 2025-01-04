package Model;

public class Khachhang {
    private String ID_KH;
    private String Ten_Khach_Hang;
    private String So_Dien_Thoai;
    private String Dia_Chi;
    private String Tai_Khoan;
    private String Mat_Khau;

    // Constructor không tham số
    public Khachhang() {
    }

    // Constructor có tham số
    public Khachhang(String ID_KH, String Ten_Khach_Hang, String So_Dien_Thoai, String Dia_Chi, String Tai_Khoan, String Mat_Khau) {
        this.ID_KH = ID_KH;
        this.Ten_Khach_Hang = Ten_Khach_Hang;
        this.So_Dien_Thoai = So_Dien_Thoai;
        this.Dia_Chi = Dia_Chi;
        this.Tai_Khoan = Tai_Khoan;
        this.Mat_Khau = Mat_Khau;
    }

    // Getter và Setter cho từng thuộc tính
    public String getID_KH() {
        return ID_KH;
    }

    public void setID_KH(String ID_KH) {
        this.ID_KH = ID_KH;
    }

    public String getTen_Khach_Hang() {
        return Ten_Khach_Hang;
    }

    public void setTen_Khach_Hang(String Ten_Khach_Hang) {
        this.Ten_Khach_Hang = Ten_Khach_Hang;
    }

    public String getSo_Dien_Thoai() {
        return So_Dien_Thoai;
    }

    public void setSo_Dien_Thoai(String So_Dien_Thoai) {
        this.So_Dien_Thoai = So_Dien_Thoai;
    }

    public String getDia_Chi() {
        return Dia_Chi;
    }

    public void setDia_Chi(String Dia_Chi) {
        this.Dia_Chi = Dia_Chi;
    }

    public String getTai_Khoan() {
        return Tai_Khoan;
    }

    public void setTai_Khoan(String Tai_Khoan) {
        this.Tai_Khoan = Tai_Khoan;
    }

    public String getMat_Khau() {
        return Mat_Khau;
    }

    public void setMat_Khau(String Mat_Khau) {
        this.Mat_Khau = Mat_Khau;
    }
}
