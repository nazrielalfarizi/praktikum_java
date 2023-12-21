
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class umur {
    public static void main(String[]args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan umur anda : ");
        int umur=inputan.nextInt();
        if (umur <5){
            System.out.println("Balita");
        }
        else if (umur <=12){
            System.out.println("Anak-anak");
        }
        else if (umur <=18){
            System.out.println("Remaja");
        }
        else if (umur <=40){
            System.out.println("Dewasa");
        }
        else if (umur <60){
            System.out.println("Paruhbaya");
        }
         else if (umur >=60)
            System.out.println("Lanjut usia");
        }
    }   

