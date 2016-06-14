package com.venus.api.repository.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
(name = "PRODUCT")
public class Product {

	@Id
	@Column(name="PRODUCT_ID")
	private long productId;
	
	@Column(name="POST_USER_ID")
	private String displayName;
	
	@Column(name="POST_DATE")
	private int saleType;
	
	@Column(name="UPDATE_DATE")
	private Date updateDate;
	
	@Column(name="PRODUCT_STATUS")
	private String productStatus;
	
	@Column(name="CONFIRMED_USER_ID")
	private int confirmUserId;
	
	@Column(name="SALE_COMMENT")
	private String saleComment;
	
	@Column(name="PRODUCT_TYPE_ID")
	private int productTypeId;
	
	@Column(name="DT_TIEU_DE")
	private String dtTieuDe;

	@Column(name="DT_NGAY_DANG")
	private Date dtNgayDang;

	@Column(name="DT_MO_TA")
	private String dtMoTa;
	
	@Column(name="DT_DIA_CHI")
	private String dtDiaChi;
	
	@Column(name="DT_DIEN_TICH")
	private int dtDienTich;
	
	@Column(name="DT_NGANG")
	private int dtNgang;
	
	@Column(name="DT_DAI")
	private int dtDai;

	@Column(name="DT_DIEN_TICH_XAY_DUNG")
	private int dtDienTichXayDung;
	
	@Column(name="DT_NAM_XAY_DUNG")
	private int dtNamXayDung;
	
	@Column(name="DT_SO_TANG")
	private int dtSoTang;
	
	@Column(name="DT_PHONG_NGU")
	private int dtPhongNgu;
	
	@Column(name="DT_PHONG_KHACH")
	private int dtPhongKhach;
	
	@Column(name="DT_BEP")
	private int dtBep;
	
	@Column(name="DT_TOILET")
	private int dtToilet;
	
	@Column(name="DT_BAN_CONG")
	private boolean dtBanCong;
	
	@Column(name="DT_SAN_VUON")
	private boolean dtSanVuon;
	
	@Column(name="DT_HUONG_NHA")
	private String dtHuongNha;
	
	@Column(name="DT_DUONG_RONG")
	private int dtDuongRong;
	
	@Column(name="DT_CACH_DUONG_O_TO")
	private int dtCachDuongOto;
	
	@Column(name="DT_GIAY_TO_PHAP_LY")
	private String dtGiayToPhapLy;
	
	@Column(name="DT_THUOC_DU_AN")
	private String dtThuocDuAn;
	
	@Column(name="DT_TONG_GIA_BAN")
	private double dtTongGiaBan;
	
	@Column(name="DT_DON_GIA_M2")
	private double dtDonGiaM2;
	
	@Column(name="DT_THUONG_LUONG")
	private String dtThuongLuong;
	
	@Column(name="DT_GIAO_DICH")
	private String dtGiaoDich;
	
	@Column(name="DT_DONG_Y_MOI_GIOI")
	private String dtDongYMoiGioi;
	
	@Column(name="DT_THOI_GIAN_XEM_NHA")
	private String dtThoiGianXemNha;
	
	@Column(name="DT_GHI_CHU_KHAC")
	private String dtGhiChuKhac;
	
	@Column(name="DT_GIA_THUE_THANG")
	private double dtGiaThueThang;
	
	@Column(name="DT_PHI_QUAN_LY")
	private double dtPhiQuanLy;
	
	@Column(name="DT_HOP_DONG_TOI_THIEU")
	private String dtHopDongToiThieu;
	
	@Column(name="DT_DAT_COC")
	private String dtDatCoc;
	
	@Column(name="DT_THANH_TOAN_LAN")
	private String dtThanhToanLan;
	
	@Column(name="DT_LANGTUDE")
	private String dtLangtude;
	
	@Column(name="DT_LONGTUDE")
	private String dtLongtude;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;
	
	@OneToMany
	@JoinTable(name = "VENUS_USER", joinColumns = @JoinColumn(name = "USER_ID"), 
			inverseJoinColumns = @JoinColumn(name = "POST_USER_ID"))
    private List<Users> postUsersId = new ArrayList<Users>();
	
	@OneToMany
	@JoinTable(name = "VENUS_USER", joinColumns = @JoinColumn(name = "USER_ID"), 
			inverseJoinColumns = @JoinColumn(name = "CONFIRMED_USER_ID"))
    private List<Users> confirmUsersId = new ArrayList<Users>();
	
	@ManyToOne
	@JoinTable(name = "PRODUCT_TYPE", joinColumns = @JoinColumn(name = "PRODUCT_TYPE_ID"), 
			inverseJoinColumns = @JoinColumn(name = "PRODUCT_TYPE_ID"))
    private List<ProductType> productTypes = new ArrayList<ProductType>();

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public int getSaleType() {
		return saleType;
	}

	public void setSaleType(int saleType) {
		this.saleType = saleType;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getProductStatus() {
		return productStatus;
	}

	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}

	public int getConfirmUserId() {
		return confirmUserId;
	}

	public void setConfirmUserId(int confirmUserId) {
		this.confirmUserId = confirmUserId;
	}

	public String getSaleComment() {
		return saleComment;
	}

	public void setSaleComment(String saleComment) {
		this.saleComment = saleComment;
	}

	public int getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(int productTypeId) {
		this.productTypeId = productTypeId;
	}

	public String getDtTieuDe() {
		return dtTieuDe;
	}

	public void setDtTieuDe(String dtTieuDe) {
		this.dtTieuDe = dtTieuDe;
	}

	public Date getDtNgayDang() {
		return dtNgayDang;
	}

	public void setDtNgayDang(Date dtNgayDang) {
		this.dtNgayDang = dtNgayDang;
	}

	public String getDtMoTa() {
		return dtMoTa;
	}

	public void setDtMoTa(String dtMoTa) {
		this.dtMoTa = dtMoTa;
	}

	public String getDtDiaChi() {
		return dtDiaChi;
	}

	public void setDtDiaChi(String dtDiaChi) {
		this.dtDiaChi = dtDiaChi;
	}

	public int getDtDienTich() {
		return dtDienTich;
	}

	public void setDtDienTich(int dtDienTich) {
		this.dtDienTich = dtDienTich;
	}

	public int getDtNgang() {
		return dtNgang;
	}

	public void setDtNgang(int dtNgang) {
		this.dtNgang = dtNgang;
	}

	public int getDtDai() {
		return dtDai;
	}

	public void setDtDai(int dtDai) {
		this.dtDai = dtDai;
	}

	public int getDtDienTichXayDung() {
		return dtDienTichXayDung;
	}

	public void setDtDienTichXayDung(int dtDienTichXayDung) {
		this.dtDienTichXayDung = dtDienTichXayDung;
	}

	public int getDtNamXayDung() {
		return dtNamXayDung;
	}

	public void setDtNamXayDung(int dtNamXayDung) {
		this.dtNamXayDung = dtNamXayDung;
	}

	public int getDtSoTang() {
		return dtSoTang;
	}

	public void setDtSoTang(int dtSoTang) {
		this.dtSoTang = dtSoTang;
	}

	public int getDtPhongNgu() {
		return dtPhongNgu;
	}

	public void setDtPhongNgu(int dtPhongNgu) {
		this.dtPhongNgu = dtPhongNgu;
	}

	public int getDtPhongKhach() {
		return dtPhongKhach;
	}

	public void setDtPhongKhach(int dtPhongKhach) {
		this.dtPhongKhach = dtPhongKhach;
	}

	public int getDtBep() {
		return dtBep;
	}

	public void setDtBep(int dtBep) {
		this.dtBep = dtBep;
	}

	public int getDtToilet() {
		return dtToilet;
	}

	public void setDtToilet(int dtToilet) {
		this.dtToilet = dtToilet;
	}

	public boolean isDtBanCong() {
		return dtBanCong;
	}

	public void setDtBanCong(boolean dtBanCong) {
		this.dtBanCong = dtBanCong;
	}

	public boolean isDtSanVuon() {
		return dtSanVuon;
	}

	public void setDtSanVuon(boolean dtSanVuon) {
		this.dtSanVuon = dtSanVuon;
	}

	public String getDtHuongNha() {
		return dtHuongNha;
	}

	public void setDtHuongNha(String dtHuongNha) {
		this.dtHuongNha = dtHuongNha;
	}

	public int getDtDuongRong() {
		return dtDuongRong;
	}

	public void setDtDuongRong(int dtDuongRong) {
		this.dtDuongRong = dtDuongRong;
	}

	public int getDtCachDuongOto() {
		return dtCachDuongOto;
	}

	public void setDtCachDuongOto(int dtCachDuongOto) {
		this.dtCachDuongOto = dtCachDuongOto;
	}

	public String getDtGiayToPhapLy() {
		return dtGiayToPhapLy;
	}

	public void setDtGiayToPhapLy(String dtGiayToPhapLy) {
		this.dtGiayToPhapLy = dtGiayToPhapLy;
	}

	public String getDtThuocDuAn() {
		return dtThuocDuAn;
	}

	public void setDtThuocDuAn(String dtThuocDuAn) {
		this.dtThuocDuAn = dtThuocDuAn;
	}

	public double getDtTongGiaBan() {
		return dtTongGiaBan;
	}

	public void setDtTongGiaBan(double dtTongGiaBan) {
		this.dtTongGiaBan = dtTongGiaBan;
	}

	public double getDtDonGiaM2() {
		return dtDonGiaM2;
	}

	public void setDtDonGiaM2(double dtDonGiaM2) {
		this.dtDonGiaM2 = dtDonGiaM2;
	}

	public String getDtThuongLuong() {
		return dtThuongLuong;
	}

	public void setDtThuongLuong(String dtThuongLuong) {
		this.dtThuongLuong = dtThuongLuong;
	}

	public String getDtGiaoDich() {
		return dtGiaoDich;
	}

	public void setDtGiaoDich(String dtGiaoDich) {
		this.dtGiaoDich = dtGiaoDich;
	}

	public String getDtDongYMoiGioi() {
		return dtDongYMoiGioi;
	}

	public void setDtDongYMoiGioi(String dtDongYMoiGioi) {
		this.dtDongYMoiGioi = dtDongYMoiGioi;
	}

	public String getDtThoiGianXemNha() {
		return dtThoiGianXemNha;
	}

	public void setDtThoiGianXemNha(String dtThoiGianXemNha) {
		this.dtThoiGianXemNha = dtThoiGianXemNha;
	}

	public String getDtGhiChuKhac() {
		return dtGhiChuKhac;
	}

	public void setDtGhiChuKhac(String dtGhiChuKhac) {
		this.dtGhiChuKhac = dtGhiChuKhac;
	}

	public double getDtGiaThueThang() {
		return dtGiaThueThang;
	}

	public void setDtGiaThueThang(double dtGiaThueThang) {
		this.dtGiaThueThang = dtGiaThueThang;
	}

	public double getDtPhiQuanLy() {
		return dtPhiQuanLy;
	}

	public void setDtPhiQuanLy(double dtPhiQuanLy) {
		this.dtPhiQuanLy = dtPhiQuanLy;
	}

	public String getDtHopDongToiThieu() {
		return dtHopDongToiThieu;
	}

	public void setDtHopDongToiThieu(String dtHopDongToiThieu) {
		this.dtHopDongToiThieu = dtHopDongToiThieu;
	}

	public String getDtDatCoc() {
		return dtDatCoc;
	}

	public void setDtDatCoc(String dtDatCoc) {
		this.dtDatCoc = dtDatCoc;
	}

	public String getDtThanhToanLan() {
		return dtThanhToanLan;
	}

	public void setDtThanhToanLan(String dtThanhToanLan) {
		this.dtThanhToanLan = dtThanhToanLan;
	}

	public String getDtLangtude() {
		return dtLangtude;
	}

	public void setDtLangtude(String dtLangtude) {
		this.dtLangtude = dtLangtude;
	}

	public String getDtLongtude() {
		return dtLongtude;
	}

	public void setDtLongtude(String dtLongtude) {
		this.dtLongtude = dtLongtude;
	}

	public String getCreateUserId() {
		return createUserId;
	}

	public void setCreateUserId(String createUserId) {
		this.createUserId = createUserId;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastModifiedUserId() {
		return lastModifiedUserId;
	}

	public void setLastModifiedUserId(String lastModifiedUserId) {
		this.lastModifiedUserId = lastModifiedUserId;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public List<Users> getPostUsersId() {
		return postUsersId;
	}

	public void setPostUsersId(List<Users> postUsersId) {
		this.postUsersId = postUsersId;
	}

	public List<Users> getConfirmUsersId() {
		return confirmUsersId;
	}

	public void setConfirmUsersId(List<Users> confirmUsersId) {
		this.confirmUsersId = confirmUsersId;
	}

	public List<ProductType> getProductTypes() {
		return productTypes;
	}

	public void setProductTypes(List<ProductType> productTypes) {
		this.productTypes = productTypes;
	}
	
}
