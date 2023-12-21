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
public class SuaraHewan {
    public static void main(String[] args){
        Hewan hewan = new Hewan();
        kucing KUCING = new kucing();
        ayam AYAM = new ayam();
        hewan.suara();
        KUCING.suara();
        AYAM.suara();
        
    }
}
