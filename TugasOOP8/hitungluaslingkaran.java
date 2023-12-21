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
public class hitungluaslingkaran {
    public void konstanta(){
        int diameter = 20;
        double v = 3.14;
        System.out.println("Hasil luas lingkaran "+ v*(diameter/2)*(diameter/2));
    }
    public void kontanta(int d, double v1){
        System.out.println("Hasil luas lingkaran "+ v1*(d/2)*(d/2));
    }
    public static void main(String[]args){
        hitungluaslingkaran luas;
        luas = new hitungluaslingkaran();
        luas.konstanta();
        luas.kontanta(7, 22/7);
        
    }
}
