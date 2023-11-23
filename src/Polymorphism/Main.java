/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Polymorphism;

/**
 *
 * @author Admin
 */
public class Main {
    public static void main(String[]args){
        Loki loki = new Loki();
        Loki2 loki2 = new Loki2();
        Loki_god loki_god = new Loki_god();
        
        loki.lokigod();
        loki2.lokigod();
        loki_god.lokigod();
    }

} 

