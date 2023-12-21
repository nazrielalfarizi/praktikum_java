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
public class Mahasiswa {
    int nim;
    public String nama;
    private double ipk;
    
    public void setIPK(double nilai){
        ipk = nilai;
    }
    public double getIPK(){
        return ipk;
    }
}


