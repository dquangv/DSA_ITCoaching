/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module_01;

/**
 *
 * @author Quang
 */
public class Module_01 {

    public static void helloWorld(String str) {
        System.out.println(str);
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
    }
}
