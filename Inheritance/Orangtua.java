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
public class Orangtua {
    String nama;
    int umur, berat;
    public static void main(String[]args){
        Orangtua anak1 = new Orangtua();
        Orangtua anak2 = new Orangtua();
        Orangtua anak3 = new Orangtua();
        
        anak1 kak = new anak1();
        kak.menyetir();
        
        anak1.nama = "Riri";
        anak1.berat = 60;
        anak1.umur = 23;
        System.out.println("nama anak pertama "+ anak1.nama);
        System.out.println("umur anak pertama "+ anak1.umur);
        anak1.lari();
        
        
        anak2.nama = "Rere";
        anak2.berat = 45;
        anak2.umur = 20;
        System.out.println("nama anak pertama "+ anak2.nama);
        System.out.println("umur anak pertama "+ anak2.umur);
        anak2.nonton();
        
        
        anak3.nama = "Roro";
        anak3.berat = 55;
        anak3.umur = 17;
        System.out.println("nama anak pertama "+ anak3.nama);
        System.out.println("umur anak pertama "+ anak3.umur);
        anak3.belajar();
    }
    void lari(){
        System.out.println("lari pagi");
    }
    void nonton(){
        System.out.println("nonton tv");
    }
    void belajar(){
        System.out.println("belajar ngoding");
    }
}
    class anak1 extends Orangtua{
        void menyetir(){
            System.out.println("menyetir mobil");
        }
    }
    class anak2 extends Orangtua{
        void sepakbola(){
            System.out.println("menonton sepakbola");
        }
    }
    class anak3 extends Orangtua{
        void bersepeda(){
            System.out.println("bersepeda pagi hari");
        }
    }