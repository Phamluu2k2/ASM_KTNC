package com.example.ASM_KTNC.Math;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TinhTichTest {

    // Test Case 1: Số nguyên dương * Số nguyên dương
    @Test
    public void testTinhTichHaiSoNguyen() {
        Assertions.assertEquals(18, TinhTich.tinhTich(6, 3));
    }

    // Test Case 2: Số nguyên âm * Số nguyên âm
    @Test
    public void testTinhTichHaiSoNguyenAm() {
        Assertions.assertEquals(18, TinhTich.tinhTich(-6, -3));
    }

    // Test Case 3: Số nguyên dương * Số nguyên âm
    @Test
    public void testTinhTichSoNguyenDuongVaSoNguyenAm() {
        Assertions.assertEquals(-18, TinhTich.tinhTich(6, -3));
    }

    // Test Case 4: Số nguyên âm * Số nguyên dương
    @Test
    public void testTinhTichSoNguyenAmVaSoNguyenDuong() {
        Assertions.assertEquals(-18, TinhTich.tinhTich(-6, 3));
    }

    // Test Case 5: Số nguyên dương * Số 0
    @Test
    public void testTinhTichSoNguyenDuongVaSoKhong() {
        Assertions.assertEquals(0, TinhTich.tinhTich(8, 0));
    }

    // Test Case 6: Số nguyên âm * Số 0
    @Test
    public void testTinhTichSoNguyenAmVaSoKhong() {
        Assertions.assertEquals(0, TinhTich.tinhTich(-8, 0));
    }

    // Test Case 7: Số 0 * Số nguyên dương
    @Test
    public void testTinhTichSoKhongVaSoNguyenDuong() {
        Assertions.assertEquals(0, TinhTich.tinhTich(0, 7));
    }

    // Test Case 8: Số 0 * Số nguyên âm
    @Test
    public void testTinhTichSoKhongVaSoNguyenAm() {
        Assertions.assertEquals(0, TinhTich.tinhTich(0, -7));
    }

    // Test Case 9: Kiểm tra khi nhập vào không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhTichSoNguyenVaKyTuChu() {
        TinhTich.tinhTich(Integer.parseInt("a"), 8);
    }

    // Test Case 10: Kiểm tra khi nhập vào 1 số nguyên và 1 số không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhTichMotSoNguyenVaMotKhongPhaiSoNguyen() {
        TinhTich.tinhTich(Integer.parseInt("9"), Integer.parseInt("b"));
    }
}
