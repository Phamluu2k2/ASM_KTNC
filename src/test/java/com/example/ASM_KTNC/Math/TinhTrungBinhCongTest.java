package com.example.ASM_KTNC.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TinhTrungBinhCongTest {

    // Test case tính trung bình cộng của các số dương
    @Test
    public void testTinhTrungBinhCongPositivelistSo() {
        List<Double> listSo = Arrays.asList(2.0, 3.0, 4.0, 5.0, 6.0);
        double ketQua = 4.0;
        Assertions.assertEquals(ketQua, TinhTrungBinhCong.tinhTrungBinhCong(listSo), 0.001);
    }

    // Test case tính trung bình cộng của các số âm
    @Test
    public void testTinhTrungBinhCongNegativelistSo() {
        List<Double> listSo = Arrays.asList(-2.0, -3.0, -4.0, -5.0, -6.0);
        double ketQua = -4.0;
        Assertions.assertEquals(ketQua, TinhTrungBinhCong.tinhTrungBinhCong(listSo), 0.001);
    }

    // Test case tính trung bình cộng của các số dương và số âm
    @Test
    public void testTinhTrungBinhCongMixedlistSo() {
        List<Double> listSo = Arrays.asList(-2.0, 3.0, -4.0, 5.0, -6.0);
        double ketQua = -0.8;
        Assertions.assertEquals(ketQua, TinhTrungBinhCong.tinhTrungBinhCong(listSo), 0.001);
    }

    // Test case tính trung bình cộng của một số duy nhất
    @Test
    public void testTinhTrungBinhCongSingleNumber() {
        List<Double> listSo = Arrays.asList(4.0);
        double ketQua = 4.0;
        Assertions.assertEquals(ketQua, TinhTrungBinhCong.tinhTrungBinhCong(listSo), 0.001);
    }

    // Test case tính trung bình cộng của một danh sách rỗng
    @Test
    public void testTinhTrungBinhCongEmptyList() {
        List<Double> listSo = Arrays.asList();
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            TinhTrungBinhCong.tinhTrungBinhCong(listSo);
        });
    }

    // Test case tính trung bình cộng của một danh sách null
    @Test
    public void testTinhTrungBinhCongNullList() {
        List<Double> listSo = null;
        Assertions.assertThrows(IllegalArgumentException.class, ()->{
            TinhTrungBinhCong.tinhTrungBinhCong(listSo);
        });
    }
}
