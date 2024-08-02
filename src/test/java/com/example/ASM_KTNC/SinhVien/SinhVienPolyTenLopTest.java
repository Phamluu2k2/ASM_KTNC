package com.example.ASM_KTNC.SinhVien;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienPolyTenLopTest {

    SinhVienPoly sinhVienPoly = new SinhVienPoly();

    // Test case 1: Kiểm tra tính hợp lệ của tên lớp khi không chứa ký tự đặc biệt
    @Test
    public void testKiemTraTenLopHopLe() {
        Assertions.assertTrue(sinhVienPoly.kiemTraTenLop("CNTT"));
    }

    // Test case 2: Kiểm tra tính hợp lệ của tên lớp khi chứa ký tự đặc biệt
    @Test
    public void testKiemTraTenLopChuaKyTuDacBiet() {
        Assertions.assertFalse(sinhVienPoly.kiemTraTenLop("CNTT@#"));
    }
}
