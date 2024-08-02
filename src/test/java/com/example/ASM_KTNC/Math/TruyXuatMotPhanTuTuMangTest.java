package com.example.ASM_KTNC.Math;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TruyXuatMotPhanTuTuMangTest {

    // Test case kiểm tra việc truy cập một phần tử hợp lệ từ mảng
    @Test
    public void testTruyXuatPhanTu() {
        int[] array = {1, 3, 5, 7, 9};
        int index = 3;
        int giaTri = 7;
        Assertions.assertEquals(giaTri, array[index]);
    }

    // Test case kiểm tra việc truy cập phần tử ở vị trí âm từ mảng
    @Test
    public void testTruyXuatPhanTuOViTriAm() {
        int[] array = {1, 3, 5, 7, 9};
        int index = -2;
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            int phanTu = array[index];
        });
    }

    // Test case kiểm tra việc truy cập phần tử ở vị trí vượt quá chiều dài của mảng
    @Test
    public void testTruyXuatPhanTuKhiIndexLonHonChieuDaiCuaMang() {
        int[] array = {1, 3, 5, 7, 9};
        int index = array.length;
        Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, ()->{
            int phanTu = array[index];
        });
    }

}
