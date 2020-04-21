package java.spring.VegestableShop.model;

import org.springframework.web.multipart.commons.CommonsMultipartFile;

public class NguoiDungInfor {
	
	private int MaND;
	private String TenDN;
	private String MatKhau;
	private String HoTen;
	private CommonsMultipartFile Image;
	private String DiaChi;
	private int SDT;
	private String Email;
	private String Loai;
	
	public NguoiDungInfor(CommonsMultipartFile Image) {
		super();
		this.Image= Image;
		// TODO Auto-generated constructor stub
	}

	public NguoiDungInfor(int maND, String tenDN, String matKhau, String hoTen, CommonsMultipartFile image,
			String diaChi, int sDT, String email, String loai) {
		super();
		MaND = maND;
		TenDN = tenDN;
		MatKhau = matKhau;
		HoTen = hoTen;
		Image = image;
		DiaChi = diaChi;
		SDT = sDT;
		Email = email;
		Loai = loai;
	}

	public int getMaND() {
		return MaND;
	}

	public void setMaND(int maND) {
		MaND = maND;
	}

	public String getTenDN() {
		return TenDN;
	}

	public void setTenDN(String tenDN) {
		TenDN = tenDN;
	}

	public String getMatKhau() {
		return MatKhau;
	}

	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public CommonsMultipartFile getImage() {
		return Image;
	}

	public void setImage(CommonsMultipartFile image) {
		Image = image;
	}

	public String getDiaChi() {
		return DiaChi;
	}

	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}

	public int getSDT() {
		return SDT;
	}

	public void setSDT(int sDT) {
		SDT = sDT;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getLoai() {
		return Loai;
	}

	public void setLoai(String loai) {
		Loai = loai;
	}
	
}
