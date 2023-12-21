/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PertemuanSekolah;

/**
 *
 * @author Nazriel
 */
public class ManipulasiPerson {
    public static void main(String[]args){
        var Person = new Person();
        
        Person.nama = "Muhammad Nazriel Alfarizi";
        Person.address = "Bandung";
        
        System.out.println(Person.nama);
        System.out.println(Person.address);
        System.out.println(Person.country);
    }
}
