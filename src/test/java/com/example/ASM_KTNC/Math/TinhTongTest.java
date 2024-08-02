package com.example.ASM_KTNC.Math;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class TinhTongTest {

    // Test Case 1: Số nguyên dương + Số nguyên dương
    @Test
    public void testTinhTongHaiSoNguyen() {
        Assertions.assertEquals(7, TinhTong.tinhTong(5, 2));
    }

    // Test Case 2: Số nguyên âm + Số nguyên âm
    @Test
    public void testTinhTongHaiSoNguyenAm() {
        Assertions.assertEquals(-7, TinhTong.tinhTong(-5, -2));
    }

    // Test Case 3: Số nguyên dương + Số nguyên âm
    @Test
    public void testTinhTongSoNguyenDuongVaSoNguyenAm() {
        Assertions.assertEquals(3, TinhTong.tinhTong(5, -2));
    }

    // Test Case 4: Số nguyên âm + Số nguyên dương
    @Test
    public void testTinhTongSoNguyenAmVaSoNguyenDuong() {
        Assertions.assertEquals(-3, TinhTong.tinhTong(-5, 2));
    }

    // Test Case 5: Số nguyên dương + Số 0
    @Test
    public void testTinhTongSoNguyenDuongVaSoKhong() {
        Assertions.assertEquals(7, TinhTong.tinhTong(7, 0));
    }

    // Test Case 6: Số nguyên âm + Số 0
    @Test
    public void testTinhTongSoNguyenAmVaSoKhong() {
        Assertions.assertEquals(-7, TinhTong.tinhTong(-7, 0));
    }

    // Test Case 7: Số 0 + Số nguyên dương
    @Test
    public void testTinhTongSoKhongVaSoNguyenDuong() {
        Assertions.assertEquals(2, TinhTong.tinhTong(0, 2));
    }

    // Test Case 8: Số 0 + Số nguyên âm
    @Test
    public void testTinhTongSoKhongVaSoNguyenAm() {
        Assertions.assertEquals(-8, TinhTong.tinhTong(0, -8));
    }

    // Test Case 9: Kiểm tra khi nhập vào không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhTongSoNguyenVaKyTuChu() {
        TinhTong.tinhTong(Integer.parseInt("a"), 7);
    }

    // Test Case 10: Kiểm tra khi nhập vào 1 số nguyên và 1 số không phải số nguyên
    @Test(expected = NumberFormatException.class)
    public void testTinhTongMotSoNguyenVaMotKhongPhaiSoNguyen() {
        TinhTong.tinhTong(Integer.parseInt("4"), Integer.parseInt("b"));
    }
}