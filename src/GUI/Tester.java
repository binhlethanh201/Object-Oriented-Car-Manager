/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package GUI;

/**
 *
 * @author thanhbinhle
 */
public class Tester {
    public static void main(String[] args){
        Car c = new Car();
        c.PressStartButton();
        c.PressAcceleratorButton();
        c.output();
        
        Car c2 = new Car("red", 100, true, true);
        c2.PressAcceleratorButton();
        c2.setColour("black");
        System.out.println("Colour of c2:" +c2.getColour());
        c2.output();
    }
}

