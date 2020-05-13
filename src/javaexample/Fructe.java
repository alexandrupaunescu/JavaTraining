/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaexample;

/**
 *
 * @author GAP
 */
public abstract class Fructe {

    private String culoare = "Rosu";
    public static Boolean areCodita = true;

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }
    protected String gust = "Dulce";
    public String greutate = "20g";

    public abstract String getForma();
}
