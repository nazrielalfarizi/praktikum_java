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
public class Cwhile {
    public static void main(String[]args){
        int i=1;
        
        boolean check = true;
        System.out.println("Kondisi berakhir pada bilangan?");
        Scanner scan = new Scanner(System.in);
        int condition = scan.nextInt();
        
        while(check == true){
            System.out.print("Looping ke " +i);
            if(i== condition){
                check = false;
            }
            i++;
        }
    }
}
