/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasOOP8;

/**
 *
 * @author Nazriel
 */
public class PersegiPanjang extends bangundatar {
    float panjang,lebar;
    
     @Override
    float luas(){
        float luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas);
        return luas;
    }
}
