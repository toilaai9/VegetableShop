package java.spring.VegestableShop.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Entity
@Table(name="nguoidung")
public class nguoidung {
	private int MaND;
	private String TenDN;
	private String MatKhau;
	private String HoTen;
	private CommonsMultipartFile Image;
	private String DiaChi;
	private int SDT;
	private String Email;
	private String Loai;
	
	@Id
	@Column(name="MaND")
	public int getMaND() {
		return MaND;
	}
	public void setMaND(int maND) {
		MaND = maND;
	}
	@Column(name="TenDN")
	public String getTenDN() {
		return TenDN;
	}
	public void setTenDN(String tenDN) {
		TenDN = tenDN;
	}
	@Column(name="MatKhau")
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	@Column(name="HoTen")
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	@Column(name="Image")
	public CommonsMultipartFile getImage() {
		return Image;
	}
	public void setImage(CommonsMultipartFile image) {
		Image = image;
	}
	@Column(name="DiaChi")
	public String getDiaChi() {
		return DiaChi;
	}
	
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	@Column(name="SDT")
	public int getSDT() {
		return SDT;
	}
	public void setSDT(int sDT) {
		SDT = sDT;
	}
	@Column(name="Email")
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	@Column(name="Loai")
	public String getLoai() {
		return Loai;
	}
	public void setLoai(String loai) {
		Loai = loai;
	}
	
	
}
