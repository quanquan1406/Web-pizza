package Model;

public class Sanpham {
    private String ID_SP;
    private String Ten_SP;
    private Double Gia;
    private String Mo_Ta;
    private String Anh;
    private String Loai_SP;

    // Constructor không tham số
    public Sanpham() {
    }

    // Constructor có tham số
    public Sanpham(String ID_SP, String Ten_SP, Double Gia, String Mo_Ta, String Anh, String Loai_SP) {
        this.ID_SP = ID_SP;
        this.Ten_SP = Ten_SP;
        this.Gia = Gia;
        this.Mo_Ta = Mo_Ta;
        this.Anh = Anh;
        this.Loai_SP = Loai_SP;
    }

    // Getter và Setter cho từng thuộc tính
    public String getID_SP() {
        return ID_SP;
    }

    public void setID_SP(String ID_SP) {
        this.ID_SP = ID_SP;
    }

    public String getTen_SP() {
        return Ten_SP;
    }

    public void setTen_SP(String Ten_SP) {
        this.Ten_SP = Ten_SP;
    }

    public Double getGia() {
        return Gia;
    }

    public void setGia(Double Gia) {
        this.Gia = Gia;
    }

    public String getMo_Ta() {
        return Mo_Ta;
    }

    public void setMo_Ta(String Mo_Ta) {
        this.Mo_Ta = Mo_Ta;
    }

    public String getAnh() {
        return Anh;
    }

    public void setAnh(String Anh) {
        this.Anh = Anh;
    }

    public String getLoai_SP() {
        return Loai_SP;
    }

    public void setLoai_SP(String Loai_SP) {
        this.Loai_SP = Loai_SP;
    }
}
