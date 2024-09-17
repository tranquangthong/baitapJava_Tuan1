/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baitapjava;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class bai4_Tuan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số tiền gửi");
        double soTienGui;
        soTienGui = scanner.nextDouble();
        System.out.println("Nhập vào số lãi hằng năm");
        double laiSuatHangNam;
        laiSuatHangNam = scanner.nextDouble();
        System.out.println("Nhập vào số tháng gửi");
        int soThangGui;
        soThangGui = scanner.nextInt();
        double laiSuatThang = laiSuatHangNam / 100 / 12;
        double soTienLai = soTienGui * laiSuatThang * soThangGui;
        double soTienCuoiKy = soTienGui + soTienLai;
        System.out.printf("Số tiền lãi: %.2f \n", soTienLai);
        System.out.printf("Số tiền gốc cuối kỳ: %.2f", soTienCuoiKy);
        
    }
}
