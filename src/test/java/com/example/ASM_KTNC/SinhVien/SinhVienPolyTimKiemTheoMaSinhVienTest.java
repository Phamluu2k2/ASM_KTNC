package com.example.ASM_KTNC.SinhVien;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienPolyTimKiemTheoMaSinhVienTest {
    SinhVienPoly sinhVienPoly = new SinhVienPoly();
    // Test Case 1: Tìm kiếm sinh viên tồn tại
    @Test
    public void testTimKiemTheoMaSinhVienTonTai() {
        SinhVien sv = new SinhVien("1", "Nguyen Van A", "CNTT", "Cong nghe thong tin", "SV1");
        sinhVienPoly.add(sv);
        SinhVien ketQua = sinhVienPoly.timKiemTheoMaSinhVien("SV1");
        Assertions.assertEquals(sv, ketQua);
    }
    // Test Case 2: Tìm kiếm sinh viên không tồn tại
    @Test
    public void testTimKiemTheoMaSinhVienKhongTonTai() {
        SinhVien result = sinhVienPoly.timKiemTheoMaSinhVien("SV2");
        Assertions.assertNull(result);
    }
    @Test
    public void testTimKiemTheoMaSinhVienMaRong() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienPoly.timKiemTheoMaSinhVien("");
        });
        Assertions.assertEquals("Mã sinh viên không được null hoặc rỗng", exception.getMessage());
    }
    // Test Case 4: Tìm kiếm sinh viên với mã null
    @Test
    public void testTimKiemTheoMaSinhVienMaNull() {
        IllegalArgumentException exception = Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sinhVienPoly.timKiemTheoMaSinhVien(null);
        });
        Assertions.assertEquals("Mã sinh viên không được null hoặc rỗng", exception.getMessage());
    }
}
