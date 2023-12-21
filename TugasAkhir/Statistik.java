/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasAkhir;

/**
 *
 * @author Nazriel
 */
public class Statistik {
    public static void main(String[]args){
        // membuat objek Ronaldo
        Ronaldo MU = new Ronaldo();
        // membuat objek Messi
        Messi PSG = new Messi();
        
        // mengisi attribut class Ronaldo
        MU.name = "Cristiano Ronaldo";
        MU.Klub = "Manchester United";
        MU.JumlahGol = 801;
        
        //mengisi attribut class Messi
        PSG.name = "Lionel Messi";
        PSG.Klub = "Paris Saint Germain";
        PSG.JumlahGol = 756;
        
        // menjalankan method Ronaldo
        MU.shooting();
        
        // menjalankan method Messi
        PSG.shooting();
    }
}
