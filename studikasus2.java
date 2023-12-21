/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class studikasus2 {
    public static void main(String[]args){
        int i,j,k,l;
        
        for(i=1;i<=6;i++){
            for(j=5;j>=i;j--){
            System.out.print(" ");
            }
        for(k=1;k<=i;k++){
            System.out.print("*");
        }
        for(l=1;l<=i-1;l++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
}
