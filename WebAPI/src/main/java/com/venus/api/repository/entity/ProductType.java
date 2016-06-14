package com.venus.api.repository.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
(name = "PRODUCT_TYPE")
public class ProductType {

	@Id
	@Column(name="PRODUCT_TYPE_ID")
	private long productTypeId;
	
	@Column(name="PRODUCT_TYPE_NAME")
	private String displayName;
	
	@Column(name="SALE_TYPE")
	private int saleType;
	
	@Column(name="DSP_TIEU_DE")
	private boolean dspTieuDe;
	
	@Column(name="DSP_NGAY_DANG")
	private boolean dspNgayDang;
	
	@Column(name="DSP_LUOT_XEM")
	private boolean dspLuotXem;
	
	@Column(name="DSP_HINH_ANH")
	private boolean dspHinhAnh;
	
	@Column(name="DSP_MO_TA")
	private boolean dspMoTa;
	
	@Column(name="DSP_DIA_CHI")
	private boolean dspDiaChi;
	
	@Column(name="DSP_DIEN_TICH")
	private boolean dspDienTich;
	
	@Column(name="DSP_NGANG")
	private boolean dspNgang;
	
	@Column(name="DSP_DAI")
	private boolean dspDai;

	@Column(name="DSP_DIEN_TICH_XAY_DUNG")
	private boolean dspDienTichXayDung;
	
	@Column(name="DSP_NAM_XAY_DUNG")
	private boolean dspNamXayDung;
	
	@Column(name="DSP_SO_TANG")
	private boolean dspSoTang;
	
	@Column(name="DSP_PHONG_NGU")
	private boolean dspPhongNgu;
	
	@Column(name="DSP_PHONG_KHACH")
	private boolean dspPhongKhach;
	
	@Column(name="DSP_BEP")
	private boolean dspBep;
	
	@Column(name="DSP_TOILET")
	private boolean dspToilet;
	
	@Column(name="DSP_BAN_CONG")
	private boolean dspBanCong;
	
	@Column(name="DSP_SAN_VUON")
	private boolean dspSanVuon;
	
	@Column(name="DSP_HUONG_NHA")
	private boolean dspHuongNha;
	
	@Column(name="DSP_TIEN_ICH")
	private boolean dspTienIch;
	
	@Column(name="DSP_DUONG_RONG")
	private boolean dspDuongRong;
	
	@Column(name="DSP_CACH_DUONG_O_TO")
	private boolean dspCachDuongOto;
	
	@Column(name="DSP_GIAY_TO_PHAP_LY")
	private boolean dspGiayToPhapLy;
	
	@Column(name="DSP_THUOC_DU_AN")
	private boolean dspThuocDuAn;
	
	@Column(name="DSP_TONG_GIA_BAN")
	private boolean dspTongGiaBan;
	
	@Column(name="DSP_DON_GIA_M2")
	private boolean dspDonGiaM2;
	
	@Column(name="DSP_THUONG_LUONG")
	private boolean dspThuongLuong;
	
	@Column(name="DSP_GIAO_DICH")
	private boolean dspGiaoDich;
	
	@Column(name="DSP_DONG_Y_MOI_GIOI")
	private boolean dspDongYMoiGioi;
	
	@Column(name="DSP_THOI_GIAN_XEM_NHA")
	private boolean dspThoiGianXemNha;
	
	@Column(name="DSP_GIA_THUE_THANG")
	private boolean dspGiaThueThang;
	
	@Column(name="DSP_PHI_QUAN_LY")
	private boolean dspPhiQuanLy;
	
	@Column(name="DSP_HOP_DONG_TOI_THIEU")
	private boolean dspHopDongToiThieu;
	
	@Column(name="DSP_DAT_COC")
	private boolean dspDatCoc;
	
	@Column(name="DSP_THANH_TOAN_LAN")
	private boolean dspThanhToanLan;
	
	@Column(name="ORDER_KEY")
	private boolean orderKey;
	
	@Column(name="CREATE_USER_ID")
	private String createUserId;
	
	@Column(name="CREATE_DATE")
	private Date createDate;
	
	@Column(name="LAST_MODIFIED_USER_ID")
	private String lastModifiedUserId;
	
	@Column(name="LAST_MODIFIED_DATE")
	private Date lastModifiedDate;

	public long getProductTypeId() {
		return productTypeId;
	}

	public void setProductTypeId(long productTypeId) {
		this.productTypeId = productTypeId;
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

	public boolean isDspTieuDe() {
		return dspTieuDe;
	}

	public void setDspTieuDe(boolean dspTieuDe) {
		this.dspTieuDe = dspTieuDe;
	}

	public boolean isDspNgayDang() {
		return dspNgayDang;
	}

	public void setDspNgayDang(boolean dspNgayDang) {
		this.dspNgayDang = dspNgayDang;
	}

	public boolean isDspLuotXem() {
		return dspLuotXem;
	}

	public void setDspLuotXem(boolean dspLuotXem) {
		this.dspLuotXem = dspLuotXem;
	}

	public boolean isDspHinhAnh() {
		return dspHinhAnh;
	}

	public void setDspHinhAnh(boolean dspHinhAnh) {
		this.dspHinhAnh = dspHinhAnh;
	}

	public boolean isDspMoTa() {
		return dspMoTa;
	}

	public void setDspMoTa(boolean dspMoTa) {
		this.dspMoTa = dspMoTa;
	}

	public boolean isDspDiaChi() {
		return dspDiaChi;
	}

	public void setDspDiaChi(boolean dspDiaChi) {
		this.dspDiaChi = dspDiaChi;
	}

	public boolean isDspDienTich() {
		return dspDienTich;
	}

	public void setDspDienTich(boolean dspDienTich) {
		this.dspDienTich = dspDienTich;
	}

	public boolean isDspNgang() {
		return dspNgang;
	}

	public void setDspNgang(boolean dspNgang) {
		this.dspNgang = dspNgang;
	}

	public boolean isDspDai() {
		return dspDai;
	}

	public void setDspDai(boolean dspDai) {
		this.dspDai = dspDai;
	}

	public boolean isDspDienTichXayDung() {
		return dspDienTichXayDung;
	}

	public void setDspDienTichXayDung(boolean dspDienTichXayDung) {
		this.dspDienTichXayDung = dspDienTichXayDung;
	}

	public boolean isDspNamXayDung() {
		return dspNamXayDung;
	}

	public void setDspNamXayDung(boolean dspNamXayDung) {
		this.dspNamXayDung = dspNamXayDung;
	}

	public boolean isDspSoTang() {
		return dspSoTang;
	}

	public void setDspSoTang(boolean dspSoTang) {
		this.dspSoTang = dspSoTang;
	}

	public boolean isDspPhongNgu() {
		return dspPhongNgu;
	}

	public void setDspPhongNgu(boolean dspPhongNgu) {
		this.dspPhongNgu = dspPhongNgu;
	}

	public boolean isDspPhongKhach() {
		return dspPhongKhach;
	}

	public void setDspPhongKhach(boolean dspPhongKhach) {
		this.dspPhongKhach = dspPhongKhach;
	}

	public boolean isDspBep() {
		return dspBep;
	}

	public void setDspBep(boolean dspBep) {
		this.dspBep = dspBep;
	}

	public boolean isDspToilet() {
		return dspToilet;
	}

	public void setDspToilet(boolean dspToilet) {
		this.dspToilet = dspToilet;
	}

	public boolean isDspBanCong() {
		return dspBanCong;
	}

	public void setDspBanCong(boolean dspBanCong) {
		this.dspBanCong = dspBanCong;
	}

	public boolean isDspSanVuon() {
		return dspSanVuon;
	}

	public void setDspSanVuon(boolean dspSanVuon) {
		this.dspSanVuon = dspSanVuon;
	}

	public boolean isDspHuongNha() {
		return dspHuongNha;
	}

	public void setDspHuongNha(boolean dspHuongNha) {
		this.dspHuongNha = dspHuongNha;
	}

	public boolean isDspTienIch() {
		return dspTienIch;
	}

	public void setDspTienIch(boolean dspTienIch) {
		this.dspTienIch = dspTienIch;
	}

	public boolean isDspDuongRong() {
		return dspDuongRong;
	}

	public void setDspDuongRong(boolean dspDuongRong) {
		this.dspDuongRong = dspDuongRong;
	}

	public boolean isDspCachDuongOto() {
		return dspCachDuongOto;
	}

	public void setDspCachDuongOto(boolean dspCachDuongOto) {
		this.dspCachDuongOto = dspCachDuongOto;
	}

	public boolean isDspGiayToPhapLy() {
		return dspGiayToPhapLy;
	}

	public void setDspGiayToPhapLy(boolean dspGiayToPhapLy) {
		this.dspGiayToPhapLy = dspGiayToPhapLy;
	}

	public boolean isDspThuocDuAn() {
		return dspThuocDuAn;
	}

	public void setDspThuocDuAn(boolean dspThuocDuAn) {
		this.dspThuocDuAn = dspThuocDuAn;
	}

	public boolean isDspTongGiaBan() {
		return dspTongGiaBan;
	}

	public void setDspTongGiaBan(boolean dspTongGiaBan) {
		this.dspTongGiaBan = dspTongGiaBan;
	}

	public boolean isDspDonGiaM2() {
		return dspDonGiaM2;
	}

	public void setDspDonGiaM2(boolean dspDonGiaM2) {
		this.dspDonGiaM2 = dspDonGiaM2;
	}

	public boolean isDspThuongLuong() {
		return dspThuongLuong;
	}

	public void setDspThuongLuong(boolean dspThuongLuong) {
		this.dspThuongLuong = dspThuongLuong;
	}

	public boolean isDspGiaoDich() {
		return dspGiaoDich;
	}

	public void setDspGiaoDich(boolean dspGiaoDich) {
		this.dspGiaoDich = dspGiaoDich;
	}

	public boolean isDspDongYMoiGioi() {
		return dspDongYMoiGioi;
	}

	public void setDspDongYMoiGioi(boolean dspDongYMoiGioi) {
		this.dspDongYMoiGioi = dspDongYMoiGioi;
	}

	public boolean isDspThoiGianXemNha() {
		return dspThoiGianXemNha;
	}

	public void setDspThoiGianXemNha(boolean dspThoiGianXemNha) {
		this.dspThoiGianXemNha = dspThoiGianXemNha;
	}

	public boolean isDspGiaThueThang() {
		return dspGiaThueThang;
	}

	public void setDspGiaThueThang(boolean dspGiaThueThang) {
		this.dspGiaThueThang = dspGiaThueThang;
	}

	public boolean isDspPhiQuanLy() {
		return dspPhiQuanLy;
	}

	public void setDspPhiQuanLy(boolean dspPhiQuanLy) {
		this.dspPhiQuanLy = dspPhiQuanLy;
	}

	public boolean isDspHopDongToiThieu() {
		return dspHopDongToiThieu;
	}

	public void setDspHopDongToiThieu(boolean dspHopDongToiThieu) {
		this.dspHopDongToiThieu = dspHopDongToiThieu;
	}

	public boolean isDspDatCoc() {
		return dspDatCoc;
	}

	public void setDspDatCoc(boolean dspDatCoc) {
		this.dspDatCoc = dspDatCoc;
	}

	public boolean isDspThanhToanLan() {
		return dspThanhToanLan;
	}

	public void setDspThanhToanLan(boolean dspThanhToanLan) {
		this.dspThanhToanLan = dspThanhToanLan;
	}

	public boolean isOrderKey() {
		return orderKey;
	}

	public void setOrderKey(boolean orderKey) {
		this.orderKey = orderKey;
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
	
	
}
