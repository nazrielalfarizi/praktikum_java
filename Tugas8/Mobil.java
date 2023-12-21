/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas8;

/**
 *
 * @author Nazriel
 */
class mobil {
    String warna;
    int tahunProduksi;

    mobil (String Warna, int TahunProduksi){
        this.warna = Warna;
        this.tahunProduksi = TahunProduksi;
    }
    void info(){
        System.out.println("Warna : "+ this.warna);
        System.out.println("Tahun Produksi : "+ this.tahunProduksi);
    }
}
