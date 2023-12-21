
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class penjualbuku {
    public static void main(String[]args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Jumlah ekslempar yang dibeli : ");
        int JumlahEkslempar = inputan.nextInt();
        int JumlahBayar1 = JumlahEkslempar*5000;
        int HargaPerEkslempar,Diskon100Ekslempar,DiskonSisaEkslempar,JumlahBayar2,SisaEkslempar;
        HargaPerEkslempar = 5000;
        SisaEkslempar = JumlahEkslempar-100;
        Diskon100Ekslempar = (100*5000)-100*HargaPerEkslempar*5/100;
        DiskonSisaEkslempar = (SisaEkslempar*5000)-SisaEkslempar*HargaPerEkslempar*15/100;
        JumlahBayar2 = Diskon100Ekslempar + DiskonSisaEkslempar;
        int DiskonPertama,DiskonKedua,DiskonKetiga,JumlahBayar3,SisaEkslempar2;
        SisaEkslempar2 = JumlahEkslempar-200;
        DiskonPertama = (100*5000)-100*HargaPerEkslempar*7/100;
        DiskonKedua = (100*5000)-100*HargaPerEkslempar*17/100;
        DiskonKetiga = (SisaEkslempar2*5000)-SisaEkslempar2*HargaPerEkslempar*27/100;
        JumlahBayar3 = DiskonPertama + DiskonKedua + DiskonKetiga;
        
        if (JumlahEkslempar <=100){
            System.out.println("Tidak mendapat potongan dengan jumlah bayar = " + JumlahBayar1);
        }
        else if (JumlahEkslempar>100&&JumlahEkslempar<=200){
            System.out.println("Mendapat potongan 100 Ekslempar pertama sebesar 5% dan Sisanya 15% = " + JumlahBayar2);
        }
        else if (JumlahEkslempar>200){
            System.out.println("Mendapat potongan 100 Ekslempar pertama sebesar 7% dan 100 Ekslempar kedua sebesar 17% dan Sisanya 27% = " + JumlahBayar3);
        }
    }
}
