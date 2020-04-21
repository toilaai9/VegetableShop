package java.spring.VegestableShop.model;

public class KhuyenMaiInfor {
	private int MaKM;
	private String TenKM;
	private int PhanTram;
	
	public KhuyenMaiInfor() {
		super();
	}
	public KhuyenMaiInfor(int maKM, String tenKM, int phanTram) {
		super();
		MaKM = maKM;
		TenKM = tenKM;
		PhanTram = phanTram;
	}
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	public String getTenKM() {
		return TenKM;
	}
	public void setTenKM(String tenKM) {
		TenKM = tenKM;
	}
	public int getPhanTram() {
		return PhanTram;
	}
	public void setPhanTram(int phanTram) {
		PhanTram = phanTram;
	}
	
	
	
}
