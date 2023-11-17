/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop_basics;

/**
 *
 * @author Admin
 */
public class car {
       String car_name;
   double car_price;
    
    car(String car_name,double car_price){
        this.car_name = car_name;
        this.car_price = car_price;
}     
    void CarMode(){
        System.out.println(car_name +"is a race car");
    }
    void CarPrice(){
        System.out.println(car_price+"is grabi ka choy!");
    }
    
}
