/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mamaliaturunan;

/**
 *
 * @author Nazriel
 */
public class runmamalia {
    
    public static void main(String[]args){
    
    Mamalia hewan = new Mamalia();
    kucing persia = new kucing();
    lumbalumba ikan = new lumbalumba();
    sapi limosin = new sapi();
    
    System.out.println("kucing berjenis tulang "+persia.tulang);
    hewan.tulang();
    
    System.out.println("Lumba-lumba bernafas dengan "+ikan.nafas);
    hewan.bernafas();
    
    System.out.println("Sapi merupakan hewan yang bernafas dengan "+limosin.nafas+" dan memiliki tulang berjenis "+ limosin.tulang);
    hewan.tulang();
    hewan.bernafas();
    
    persia.habitat();
    ikan.habitat();
    limosin.habitat();
    }
}
