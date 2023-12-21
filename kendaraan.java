
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
public class kendaraan {
    public static void main(String[]args){
        Scanner masuk = new Scanner(System.in);
        int pilihan;
        System.out.print("Masukan pilihan : ");
        pilihan = masuk.nextInt();
        switch (pilihan){
            case 1:System.out.println("Naik pesawat terbang");break;
            case 2:System.out.println("Naik kereta api");break;
            case 3:System.out.println("Naik bus");break;
            case 4:System.out.println("Naik Taksi");break;
            case 5:System.out.println("Naik mobil pribadi");break;
            case 6:System.out.println("Naik motor");break;
            default:System.out.println("Anda salah memilih");break;
        }
    }
}
