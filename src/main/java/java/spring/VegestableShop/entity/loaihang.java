package java.spring.VegestableShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loaihang")
public class loaihang {
	private int MaLoai;
	private String TenLoai;
	private int MaKM;
	@Id
	@Column(name="MaLoai")
	public int getMaLoai() {
		return MaLoai;
	}
	public void setMaLoai(int maLoai) {
		MaLoai = maLoai;
	}
	@Column(name="TenLoai")
	public String getTenLoai() {
		return TenLoai;
	}
	public void setTenLoai(String tenLoai) {
		TenLoai = tenLoai;
	}
	@Column(name="MaKM")
	public int getMaKM() {
		return MaKM;
	}
	public void setMaKM(int maKM) {
		MaKM = maKM;
	}
	
	
}

