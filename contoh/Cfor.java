/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contoh;

import java.util.Scanner;

/**
 *
 * @author Nazriel
 */
public class Cfor {
    public static void main(String[]args){
        int i;
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukan jumlah looop : ");
        int jml_loop = scan.nextInt();
        for (i=1;i<=jml_loop;i+=2){
            System.out.println("Looping ke "+i );
        }
    }
}
