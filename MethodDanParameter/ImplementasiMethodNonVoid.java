/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MethodDanParameter;

/**
 *
 * @author Nazriel
 */
public class ImplementasiMethodNonVoid {
     public static void main(String[]args){
        Karyawan Karyawan001 = new Karyawan();
        
        Karyawan001.ID = "K001";
        Karyawan001.nama = "Muhammad Nazriel Alfarizi";
        Karyawan001.divisi = "Programmer";
        Karyawan001.gaji = 15000000;
        
        Karyawan001.cetakData();
        System.out.println("Sumbangan Zakat : "+Karyawan001.hitungSumbanganZakat());
    }
}
