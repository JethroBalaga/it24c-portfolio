
package Lampandstudent;


public class Lamp {
    
 boolean is_on;

    void turnOn() {
        System.out.println("Suga on!");
    }

    void turnOff() {
        System.out.println("suga off!");

    }
}
class main{
    
public static void main (String [] args){
    Lamp led = new Lamp();
    Lamp Halogen = new Lamp();
    led.turnOff();
    Halogen.turnOn();
    
}
}
