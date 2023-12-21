/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConstructorDanStatic;

/**
 *
 * @author Nazriel
 */
public class Karyawan {
    
    String nama = "Windah";
    double gaji = 20000;
    int umur = 20;
    
    Karyawan(String nama, double gaji){
        this.nama = nama;
        this.gaji = gaji;
        umur = 20;    
    }
    
    public static void absen(){
        System.out.println("Ilham hadir");
    }
}
