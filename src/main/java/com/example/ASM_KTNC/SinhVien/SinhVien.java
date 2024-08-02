package com.example.ASM_KTNC.SinhVien;

public class SinhVien {
    private String id;
    private String hoTen;
    private String maLop;
    private String tenLop;
    private String maSV;

    public SinhVien(String id, String hoTen, String maLop, String tenLop, String maSV) {
        this.id = id;
        this.hoTen = hoTen;
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.maSV = maSV;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getMaLop() {
        return maLop;
    }

    public void setMaLop(String maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id='" + id + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", maLop='" + maLop + '\'' +
                ", tenLop='" + tenLop + '\'' +
                ", maSV='" + maSV + '\'' +
                '}';
    }
}
