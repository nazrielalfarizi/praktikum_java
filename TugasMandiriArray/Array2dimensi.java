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
public class Array2dimensi {
     public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        
        System.out.print("Masukan jumlah Murid : ");
        
        int n = input.nextInt();
        
        String Murid[][]= new String[n][2];
        
        for(int i=0; i<n; i++){
            System.out.print("Murid ke "+(i+1)+"\n");
        for(int j=0;j<2;j++){
            if (j==0)
                System.out.print("Nama : ");
            else
                System.out.print("Kehadiran : ");
            
            Murid[i][j] = input.next();
            }
        }
        System.out.println("Data Kehadiran Murid");
        
        System.out.println("Nama \t\t Kehadiran");
        
        for(int i=0; i<n; i++){
            for (int j=0; j<2; j++){
                System.out.println(Murid[i][j]+"");
            }
        }
    }
}
