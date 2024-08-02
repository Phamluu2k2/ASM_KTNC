package com.example.ASM_KTNC.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienPoly {
    private static List<SinhVien> listSV = new ArrayList<>();

    public List<SinhVien> getAll() { return listSV; }
    public void add(SinhVien sv) {
        if (check(sv)) {
            listSV.add(sv);
        } else {
            throw new IllegalArgumentException("Thông tin sinh viên không hợp lệ");
        }
    }
    private boolean check(SinhVien sv) {
        return !kiemTraTrungMaSV(sv.getMaSV()) && !sv.getMaSV().isEmpty() && kiemTraTenLop(sv.getTenLop());
    }
    private boolean kiemTraTrungMaSV(String maSV) {
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(maSV)) {
                return true;
            }
        }
        return false;
    }
    public boolean kiemTraTenLop(String tenLop) { return tenLop.matches("[a-zA-Z0-9\\s]+");
    }
    public SinhVien timSinhVienTheoTen(String ten) {
        for (SinhVien sv : listSV) {
            if (sv.getHoTen().equalsIgnoreCase(ten)) {
                return sv;
            }
        }
        return null;
    }

    public List<SinhVien> timSinhVienTheoMaLop(String maLop) {
        List<SinhVien> listML = new ArrayList<>();
        for (SinhVien sv : listSV) {
            if (sv.getMaLop().equalsIgnoreCase(maLop)) {
                listML.add(sv);
            }
        }
        return listML;
    }

    public SinhVien timKiemTheoMaSinhVien(String maSV) {
        if (maSV == null || maSV.isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không được null hoặc rỗng");
        }

        // Tìm kiếm sinh viên trong danh sách theo mã
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }

        return null;
    }
}