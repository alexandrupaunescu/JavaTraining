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
public class Salami implements Saleable {
// price of salami

    float priceOfSalami = (float) 36.99;

    @Override
    public float getSalePrice() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return priceOfSalami;
    }

    public enum Taste {
        STRONG, MILD, NUTTY
    };

    private Taste gust;
// metods   

    public float getPriceOfSalami() {
        return priceOfSalami;
    }

    public void setPriceOfSalami(float priceOfSalami) {
        this.priceOfSalami = priceOfSalami;
    }

    public Taste getGust() {
        return gust;
    }

    public void setGust(Taste gust) {
        this.gust = gust;
    }

}
