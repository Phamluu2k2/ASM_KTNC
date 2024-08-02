package com.example.ASM_KTNC.Math;

import java.util.List;

public class TinhTrungBinhCong {
    public static double tinhTrungBinhCong(List<Double> listSo) {
        if (listSo == null || listSo.isEmpty()) {
            throw new IllegalArgumentException("Danh sách không được rỗng hoặc null!");
        }

        double tong = 0;
        for (Double so : listSo) {
            tong += so;
        }

        return tong / listSo.size();
    }
}
