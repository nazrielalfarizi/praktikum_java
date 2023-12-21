
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
public class tarifparkir {
    public static void main(String[]args){
        Scanner inputan = new Scanner(System.in);
        System.out.println("Masukan Jenis Kendaraan : ");
        int JenisKendaraan =inputan.nextInt();
        System.out.println("Masukan Lama Sewa : ");
        int LamaSewa =inputan.nextInt();
        int Mobil,Motor,HargaParkirMobil,HargaParkirMotor,LamaSewaMobil,LamaSewaMotor;
        Mobil = 1;
        Motor = 2;
        HargaParkirMobil = 3000;
        HargaParkirMotor = 2000;
        LamaSewaMobil = (LamaSewa-2)*1000;
        LamaSewaMotor = (LamaSewa-2)*500;
        int TotalSewaMobil,TotalSewaMotor;
        TotalSewaMobil = HargaParkirMobil + LamaSewaMobil;
        TotalSewaMotor = HargaParkirMotor + LamaSewaMotor;
        
        if (JenisKendaraan==Mobil && LamaSewa > 2){
            System.out.println("Biaya Parkir = " + TotalSewaMobil);
            }
        else if (JenisKendaraan==Mobil && LamaSewa <= 2){
            System.out.println("Biaya Parkir = " + HargaParkirMobil);
            }
        else if (JenisKendaraan==Motor && LamaSewa > 2){
            System.out.println("Biaya Parkir = " + TotalSewaMotor);
            }
        else if (JenisKendaraan==Motor && LamaSewa <= 2){
            System.out.println("Biaya Parkir = " + HargaParkirMotor);
            }
        }
    }
    
