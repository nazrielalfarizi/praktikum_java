/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polimorfisme;

/**
 *
 * @author Nazriel
 */
/** Overriding */
public class Hewan {
    public void suara(){
        System.out.println("Suara hewan, ");
    }
}
class ayam extends Hewan{
    public void suara(){
        System.out.println("Suara ayam: kukurukuk..! ");
    }
}
class kucing extends Hewan{
    public void suara(){
        System.out.println("Suara kucing: Meow..! ");
    }
}

