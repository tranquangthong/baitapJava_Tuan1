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

class hinhTron {
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
    public hinhTron() {
        
    };
    public void xuat(){
        System.out.println("Chu vi hinh tron la: "+this.chuViHinhTron());
        System.out.println("Dien tich hinh tron la: "+this.dienTichHinhTron());
    }
}
public class TAMGIAC {
    private double A;
    private double B;
    private double C;

    public void setA(double A) {
        this.A = A;
    }

    public void setB(double B) {
        this.B = B;
    }

    public void setC(double C) {
        this.C = C;
    }

    public TAMGIAC() {
    }
    public TAMGIAC(double A, double B, double C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }
    public void nhap() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap canh A:");
        this.A = sc.nextDouble();
        System.out.println("Nhap canh B");
        this.B=sc.nextDouble();
        System.out.println("Nhap canh C");
        this.C=sc.nextDouble();
    }
    public void xuat() {
        System.out.println("A "+this.A);
        System.out.println("B "+this.B);
        System.out.println("C "+this.C);
        System.out.println("Chu vi tam giac la:"+this.chuVi());
        System.out.println("Dien tich tam gia la: "+this.dienTich());
    }
    public double chuVi() {
        return this.A+this.B+this.C;
    }
    public double dienTich() {
        double p=this.chuVi()/2;
        return Math.sqrt(p*(p-this.A)*(p-this.B)*(p-this.C));
    }
    public static void main(String[] args) {
        TAMGIAC tg1=new TAMGIAC();
        tg1.nhap();
        tg1.xuat();
        hinhTron ht = new hinhTron();
        ht.nhapBanKinh();
        ht.xuat();
    }
}
