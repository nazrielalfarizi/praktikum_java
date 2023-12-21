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
public class studikasuspenilaian {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        System.out.print("Masukan Jumlah Mahasiswa : ");
    
        int n=input.nextInt();
        
        String nim [] = new String[n];
        String nama [] = new String[n];
        int uts[] = new int[n];
        int uas[] = new int[n];
        double akhir[] = new double[n];
        String index[] = new String[n];
        
        for (int i=0; i<n; i++){
            System.out.println("Mahasiswa ke : "+(i+1));
            
            System.out.print("Nim : ");
            nim[i]=input.next();
            
            System.out.print("Nama : ");
            nama[i]=input.next();
            
            System.out.print("UTS : ");
            uts[i]=input.nextInt();
            
            System.out.print("UAS : ");
            uas[i]=input.nextInt();
            
            akhir[i] = uts[i]*50/100+uas[i]*50/100;
            System.out.println("Nilai Akhir : "+akhir[i]);
            
            
            if (akhir[i] >= 80){
                index[i]="B";
            }
            else if (akhir[i] < 80){
                index[i]="C";
            }
            else if (akhir[i] < 70){
                index[i]="D";
            }
            else {
                index[i]="E";
            }
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("====================================================");
        System.out.println("No  Nim  Nama  UTS  UAS  Nilai Akhir  Index");
        System.out.println("====================================================");
        for (int i=0; i<n; i++){
           System.out.println((i+1)+"  "+nim[i]+"  "+nama[i]+"  "+uts[i]+"  "+uas[i]+"  "+akhir[i]+"  "+index[i]);
        }
        System.out.println("====================================================");
    }
}
