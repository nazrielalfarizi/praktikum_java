/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class Rumus {
    public static void main(String[]args){
        //Deklarasi variabel Volume bola
        double phi,r,r3,VolumeBola;
        phi = 3.14;
        r = 5;
        r3 = r*r*r;
        VolumeBola = 4/3*phi*r3;  
        double r2,LuasBola;
        r2 = r*r;
        LuasBola = 4*phi*r2;
        double LuasLingkaran;
        LuasLingkaran = phi*r2;
        double T,VolumeTabung;
        T = 7;
        VolumeTabung = phi*r2*T;
        
        System.out.print("Volume Permukaan Bola : " + VolumeBola + "cm3");
        System.out.print("\nLuas Permukaan Bola : " + LuasBola + "cm2\n");
        System.out.print("Luas Permukaan Lingkaran : " + LuasLingkaran + "cm2");
        System.out.print("\nVolume Permukaan Tabung : " + VolumeTabung + "cm3");
        
        
    }
}
