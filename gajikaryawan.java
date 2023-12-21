
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
public class gajikaryawan {
    public static void main(String[]args){
        String NamaKaryawan;
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Nama: ");
        NamaKaryawan = inputan.nextLine();
        System.out.println("Masukan gaji pokok: ");
        int GajiPokok = inputan.nextInt();
        int GajiBersih,Tunjangan,Pajak;
        Tunjangan = GajiPokok*20/100;
        Pajak = GajiPokok*15/100;
        GajiBersih = GajiPokok + Tunjangan - Pajak;
        
        System.out.println("Nama Karyawan adalah : " + NamaKaryawan);
        System.out.println("Gaji Bersih : " + GajiBersih);
    }
}
