/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module_01;

import java.util.Scanner;

/**
 *
 * @author Quang
 */
public class Module_01 {

    public static void helloWorld(String str) {
        System.out.println(str);
    }

    public static void inBangCuuChuong(Integer heSo) {
        for (int i = 1; i <= 10; i++) {
            int tich = heSo * i;
            System.out.println(heSo + " * " + i + " = " + tich);
        }
    }

    public static void tinhGiaiThua(Integer so) {
        int giaiThua = 1;

        for (int i = 1; i <= so; i++) {
            giaiThua *= i;
        }

        System.out.println(so + "! = " + giaiThua);
    }

    public static void timSoNguyenTo(Integer so) {
        for (int i = 1; i <= so; i++) {
            boolean flag = true;

            if (i == 1 || i == 4) {
                flag = false;
            }

            for (int j = 2; j < i / 2; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println(i);
            }
        }
    }

    public static int tinhTongCacSoChan(int n) {
        int tong = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                tong += i;
            }
        }

        return tong;
    }

    public static void veTamGiac(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {
        //Bài 1: Hello world
        System.out.println("Hello world");

        
        //Bài 2: in biến mang giá trị HW
        String helloWorld = "Hello world";
        System.out.println(helloWorld);

        
        //Bài 3: concatenate 2 biến
        String hello = "Hello", world = "world";
        String hello_world = hello + " " + world;
        System.out.println(hello_world);

        
        //Bài 4: hàm số
        Module_01.helloWorld(hello_world);

        
        //Bài 5: in bảng cửu chương
        Module_01.inBangCuuChuong(1);
        Module_01.inBangCuuChuong(2);
        Module_01.inBangCuuChuong(3);
        Module_01.inBangCuuChuong(4);
        Module_01.inBangCuuChuong(5);
        Module_01.inBangCuuChuong(6);
        Module_01.inBangCuuChuong(7);
        Module_01.inBangCuuChuong(8);
        Module_01.inBangCuuChuong(9);
        Module_01.inBangCuuChuong(10);
        

        //Bài 6: tính giai thừa
        Module_01.tinhGiaiThua(5);

        
        //Bài 7: tìm số nguyên tố
        Module_01.timSoNguyenTo(100);
        

        //Bài 8: tính tổng các số chẵn
        Scanner sc = new Scanner(System.in);

        System.out.println("Tính tổng các số chẵn từ 1 đến N, mời nhập số N: ");

        int n = Integer.parseInt(sc.nextLine());

        System.out.println("Tổng các số từ chẵn từ 1 đến " + n + " là: " + Module_01.tinhTongCacSoChan(n));

        
        //Bài 9: vẽ tam giác
        sc = new Scanner(System.in);

        System.out.println("Vẽ tam giác với N dòng, mời nhập số N: ");

        n = Integer.parseInt(sc.nextLine());

        Module_01.veTamGiac(n);
    }
}
