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
public class bai3_Tuan1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên thứ nhất: ");
        int so1 = scanner.nextInt();
        System.out.print("Nhập số nguyên thứ hai: ");
        int so2 = scanner.nextInt();

        int tong = so1 + so2;
        int hieu = so1 - so2;
        int tich = so1 * so2;
        float thuong = (float)so1 / so2;
        int phanDu = so1 % so2;

        System.out.println("Tổng: " + tong);
        System.out.println("Hiệu: " + hieu);
        System.out.println("Tích: " + tich);
        System.out.printf("Thương: %.2f \n", thuong);
        System.out.println("Phần dư: " + phanDu);
        
    }
 
}
