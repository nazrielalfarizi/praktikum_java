/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author Nazriel
 */
public class Mamalia {
    String nama, habitat, tipehewan;
    public static void main(String[]args){
        Mamalia kucing = new Mamalia();
        Mamalia anjing = new Mamalia();
        Mamalia gajah = new Mamalia();
        
        
        kucing.nama = "Kucing";
        kucing.habitat = "Darat";
        kucing.tipehewan = "Karnivora";
        System.out.println(kucing.nama+" adalah hewan "+kucing.tipehewan+ " dan tinggal di "+kucing.habitat);
        kucing.melahirkan();
        
        
        anjing.nama = "Anjing";
        anjing.habitat = "Darat";
        anjing.tipehewan = "Karnivora";
        System.out.println(anjing.nama+" adalah hewan "+anjing.tipehewan+ " dan tinggal di "+anjing.habitat);
        anjing.melahirkan();
        
        
        gajah.nama = "Roro";
        gajah.habitat = "Darat";
        gajah.tipehewan = "Herbivora";
        System.out.println(gajah.nama+" adalah hewan "+gajah.tipehewan+ " dan tinggal di "+gajah.habitat);
        gajah.melahirkan();
    }
    void melahirkan(){
        System.out.println("lari pagi");
    }
}
    class kucing extends Orangtua{
        void mencakar(){
            System.out.println(" aku bisa mencakar");
        }
    }
    class anjing extends Orangtua{
        void menggonggong(){
            System.out.println("aku suka menggongong");
        }
    }
    class gajah extends Orangtua{
        void menyembur(){
            System.out.println("aku bisa menyemburkan air");
        }
    }

