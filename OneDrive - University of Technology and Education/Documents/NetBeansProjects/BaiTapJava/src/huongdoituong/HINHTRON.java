/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package huongdoituong;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class HINHTRON {
        public static Scanner sc=new Scanner(System.in);
    private double R;
    public void nhapBanKinh() {
        System.out.println("Nhap ban kinh hinh tron: ");
        this.R=sc.nextDouble();
    }
    public double chuViHinhTron() {
        return this.R*3.14*2;
    }
    public double dienTichHinhTron() {
        return 3.14*Math.pow(this.R, 2);
    }

    public void xuat(){
        System.out.println("Chu vi hinh tron la: "+this.chuViHinhTron());
        System.out.println("Dien tich hinh tron la: "+this.dienTichHinhTron());
    }
        public HINHTRON () {
        
    };
}
