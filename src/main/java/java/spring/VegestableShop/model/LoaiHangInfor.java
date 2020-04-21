package java.spring.VegestableShop.model;

public class LoaiHangInfor {
	private int MaLoai;
	private String TenLoai;
	private int MaKM;
	public LoaiHangInfor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiHangInfor(int maLoai, String tenLoai, int maKM) {
		super();
		MaLoai = maLoai;
		TenLoai = tenLoai;
		MaKM = maKM;
	}
	public int getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(int maLoai) {
		MaLoai = maLoai;
	}
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	
	
}
