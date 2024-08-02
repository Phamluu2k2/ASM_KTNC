package com.example.ASM_KTNC.Math;

public class TruyXuatMotPhanTuTuMang {
    public static int truyXuatPhanTu(int[] array, int index) {

        if (array == null) {
            throw new IllegalArgumentException("Mảng không được null");
        }

        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("Vị trí phần tử không hợp lệ");
        }

        return array[index];
    }
}
