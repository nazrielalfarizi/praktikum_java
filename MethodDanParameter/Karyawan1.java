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
class Karyawan1 {
    String ID,nama,divisi;
    double gaji;
    void IsiData(String kode,String Nama,String Div,double Gaji){
        ID = kode;
        nama = Nama;
        divisi = Div;
        gaji = Gaji;
    }
    void cetakData(){
        System.out.println("Data Karyawan");
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Divisi : "+divisi);
        System.out.println("Gaji : "+gaji);
    }
}
