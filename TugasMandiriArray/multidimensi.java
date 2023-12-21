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
public class multidimensi {
    public static void main(String[]args){
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Jumlah Murid");
        final int JUMLAH_MURID = input.nextInt();
        System.out.println("Berapa kali mengisi absen");
        final int JUMLAH_ABSEN = input.nextInt();
        int [][][] absen = new int [JUMLAH_MURID][JUMLAH_ABSEN][2];
        
        
        for (int i=0; i< absen.length;i++){
            for (int j=0; j<absen[0].length;j++){
                for (int k=0; k<absen[0][1].length;k++){
                    System.out.print("absen[" +i+ "][" +j+ "][" +k+ "] = " + absen[i][j][k]+ "\t");
                }
                System.out.println();
            }   System.out.println();
        }
    }
}
