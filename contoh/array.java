package contoh;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nazriel
 */
public class array {
    public static void main(String[]args){
        String[] buah;
        buah = new String[5];
        buah[0]= "Apel";
        buah[1]= "Jeruk";
        buah[2]= "Mangga";
        buah[3]= "Alpukat";
        buah[4]= "Markisa";
        
        for(int i=0; i < buah.length ; i++){
        System.out.println(buah[i]);
        }
    }
    
}
