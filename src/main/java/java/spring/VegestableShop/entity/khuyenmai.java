package java.spring.VegestableShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="khuyenmai")
public class khuyenmai {
	private int MaKM;
	private String TenKM;
	private int PhanTram;
	
	@Id
	@Column(name="MaKM")
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	@Column(name="TenKM")
	public String getTenKM() {
		return TenKM;
	}
	
	public void setTenKM(String tenKM) {
		TenKM = tenKM;
	}
	@Column(name="PhanTram")
	public int getPhanTram() {
		return PhanTram;
	}
	public void setPhanTram(int phanTram) {
		PhanTram = phanTram;
	}

}
