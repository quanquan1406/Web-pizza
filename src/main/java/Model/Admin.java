package Model;

public class Admin {
	private String ID_Admin;
	private String Tai_Khoan;
	private String Mat_Khau;
	
	public Admin(String ID_Admin , String Tai_Khoan , String Mat_Khau ) {
		this.ID_Admin = ID_Admin;
		this.Tai_Khoan = Tai_Khoan;
		this.Mat_Khau = Mat_Khau;
	}
	
	public Admin() {
		
	}
	
	public String getID_Admin() {
		return ID_Admin;
	}
	
	public String getTai_Khoan() {
		return Tai_Khoan;
	}
	
	public String getMat_Khau() {
		return Mat_Khau;
	}
	
}
