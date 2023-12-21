/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasMandiriArray;

import java.util.Scanner;

/**
 *
 * @author Nazriel
 */
public class array1dimensi {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukan jumlah Murid : ");
        
        int n = input.nextInt();
        
        String Murid[]=new String[n];
        
        for(int i=0; i<Murid.length; i++){
            System.out.print("Murid ke "+(i+1)+" : ");
            Murid [i]=input.next();
        }
        System.out.println("Nama Murid yang dimasukan");
        for(int i=0;i<Murid.length;i++){
            System.out.println(Murid[i]);
        }
    }
}
