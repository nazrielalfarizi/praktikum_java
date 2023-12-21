/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author Nazriel
 */
public class Overloading {
    public void kali_1(){
        int a=5, b=6;
        System.out.println("Hasil Perkalian dari metod kali_1 ke-1 "+(a*b));
    }
    
    public void kali_1(int x, int y){
        System.out.println("Hasil Perkalian dari metod kali_1 ke-2 "+(x*y));
    }
    public static void main(String[]args){
        Overloading kali;
        kali = new Overloading();
        kali.kali_1();
        kali.kali_1(4, 10);
    }
}
