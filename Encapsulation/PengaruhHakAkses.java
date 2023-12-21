/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author Nazriel
 */
public class PengaruhHakAkses { 
    public static void main(String[]args){
        Mahasiswa Yahya = new Mahasiswa();
        Yahya.nim = 1009;
        Yahya.nama = "Yahya Al-Mahandiez";
        Yahya.setIPK(3.77);
        System.out.println("NIM : "+Yahya.nim);
        System.out.println("Nama : "+Yahya.nama);
        System.out.println("IPK : "+Yahya.getIPK());
    }
}
