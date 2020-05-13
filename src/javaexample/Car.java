/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author Dinamo
 */
public class Car implements Saleable {

    private float salePrice = (float) 500.99;
    public String name; // name of brand  

    @Override
    public float getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return salePrice;

    }

    public enum Color {
        RED, BLUE, GREEN, BLACK
    };
    public Color color; //Color of car
    public short speed; // max speed of car

    // methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car.Color getColor() {
        return color;
    }

    public void setColor(Car.Color color) {
        this.color = color;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
}
