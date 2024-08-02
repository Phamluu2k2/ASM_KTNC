package com.example.ASM_KTNC.Math;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TinhHieuTest {
    // Test Case 1: Số nguyên dương + Số nguyên dương
    @Test
    public void testTinhHieuHaiSoNguyen() {
        Assertions.assertEquals(4, TinhHieu.tinhHieu(9, 5));
    }

    // Test Case 2: Số nguyên âm + Số nguyên âm
    @Test
    public void testTinhHieuHaiSoNguyenAm() {
        Assertions.assertEquals(-4, TinhHieu.tinhHieu(-9, -5));
    }

    // Test Case 3: Số nguyên dương + Số nguyên âm
    @Test
    public void testTinhHieuSoNguyenDuongVaSoNguyenAm() {
        Assertions.assertEquals(14, TinhHieu.tinhHieu(9, -5));
    }

    // Test Case 4: Số nguyên âm + Số nguyên dương
    @Test
    public void testTinhHieuSoNguyenAmVaSoNguyenDuong() {
        Assertions.assertEquals(-14, TinhHieu.tinhHieu(-9, 5));
    }

    // Test Case 5: Số nguyên dương + Số 0
    @Test
    public void testTinhHieuSoNguyenDuongVaSoKhong() {
        Assertions.assertEquals(6, TinhHieu.tinhHieu(6, 0));
    }

    // Test Case 6: Số nguyên âm + Số 0
    @Test
    public void testTinhHieuSoNguyenAmVaSoKhong() {
        Assertions.assertEquals(-6, TinhHieu.tinhHieu(-6, 0));
    }

    // Test Case 7: Số 0 + Số nguyên dương
    @Test
    public void testTinhHieuSoKhongVaSoNguyenDuong() {
        Assertions.assertEquals(-3, TinhHieu.tinhHieu(0, 3));
    }

    // Test Case 8: Số 0 + Số nguyên âm
    @Test
    public void testTinhHieuSoKhongVaSoNguyenAm() {
        Assertions.assertEquals(3, TinhHieu.tinhHieu(0, -3));
    }

    // Test Case 9: Kiểm tra khi nhập vào không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhHieuSoNguyenVaKyTuChu() {
        TinhHieu.tinhHieu(Integer.parseInt("a"), 2);
    }

    // Test Case 10: Kiểm tra khi nhập vào 1 số nguyên và 1 số không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhHieuMotSoNguyenVaMotKhongPhaiSoNguyen() {
        TinhHieu.tinhHieu(Integer.parseInt("1"), Integer.parseInt("b"));
    }
}
