/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class diskon {
    public static void main(String[]args){
        //deklarasi variabel
        int harga,diskon,total;
        harga = 10000;
        diskon = 10000*10/100;
        total = harga-diskon;
        //Output
        System.out.print("Harga sebelum diskon :" + harga);
        System.out.print("\nDiskon :10%\n");
        System.out.print("Harga barang setelah diskon :" + total);
    }
}
