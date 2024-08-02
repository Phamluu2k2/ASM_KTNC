package com.example.ASM_KTNC.SinhVien;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SinhVienPolyThemTest {

    private SinhVienPoly sinhVienPoly = new SinhVienPoly();

    // Test Case 1: Them sinh viên hợp
    @Test
    public void testThemSinhVien(){
        SinhVien sv = new SinhVien("5", "Nguyen Van E", "CNTT", "Cong nghe thong tin", "SV5");
        sinhVienPoly.add(sv);
        Assertions.assertTrue(sinhVienPoly.getAll().contains(sv));
    }

    // Test Case 2: Thêm sinh viên trùng mã sinh viên đã có
    @Test
    public void testThemSinhVienTrungMaSVDaCo() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CNTT", "Cong nghe thong tin", "SV1");
        SinhVien sv2 = new SinhVien("2", "Nguyen Van B", "CNTT", "Cong nghe thong tin", "SV1");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sinhVienPoly.add(sv1);
            sinhVienPoly.add(sv2);
        });
    }

    // Test Case 3: Thêm sinh viên khi mã sinh viên rỗng
    @Test
    public void testThemSinhVienMaSVRong() {
        SinhVien sv = new SinhVien("1", "Nguyen Van A", "CNTT", "Cong nghe thong tin", "");
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            sinhVienPoly.add(sv);
        });
    }

    // Test Case 4: Thêm sinh viên tên lớp hợp lệ
    @Test
    public void testThemSinhVienTenLopHopLe() {
        SinhVien sv = new SinhVien("3", "Nguyen Van C", "CNTT123", "Cong nghe thong tin", "SV3");
        Assertions.assertDoesNotThrow(() -> sinhVienPoly.add(sv));
    }

    // Test Case 5: Thêm sinh viên tên lớp không hợp lệ
    @Test
    public void testThemSinhVienTenLopKhongHopLe() {
        SinhVien sv = new SinhVien("4", "Nguyen Van D", "CNTT", "Cong nghe thong tin @!", "SV4");
        Assertions.assertThrows(IllegalArgumentException.class, () ->
                sinhVienPoly.add(sv)
        );
    }
}
