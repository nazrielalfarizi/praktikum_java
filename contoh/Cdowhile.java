/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.Scanner;

/**
 *
 * @author Nazriel
 */
public class Cdowhile {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        String jawaban;
        do {
            System.out.println("Masukan tahun lahir : ");
            int tahun = scan.nextInt();
            
            System.out.println("Umur anda : "+(2021-tahun));
            System.out.println("------------------------------------------");
            System.out.println("Input lagi (Y/T) : ");
            jawaban = scan.next();
        }while (jawaban.equalsIgnoreCase("Y"));
    }
}
