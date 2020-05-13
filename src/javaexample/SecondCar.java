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
public class SecondCar implements Saleable {

    float priceOfSecondCar = (float) 7000.99;
    private String name;

    @Override
    public float getSalePrice() {
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return priceOfSecondCar;
    }

    public enum Color {
        RED, BLUE, GREEN, BLACK
    };
    public Color color; //Color of car

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public short getSpeed() {
        return speed;
    }

    public void setSpeed(short speed) {
        this.speed = speed;
    }
    public short speed; // max speed of car

}
