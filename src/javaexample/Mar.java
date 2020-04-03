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
public class Mar extends Fructe{
    
    static String soi = "Yonatan";
    Boolean areSamburi = true;
    
    public Mar() {
        System.out.println("I am the constructor withouit parameters created by developer");
    }
    
    public Mar(String cucu){
        System.out.println("I am constructor with parameter: "+cucu);
    }

    @Override
    public String getForma() {
        return "Sferica";
    }
    // testez daca vad variabila privata
    public void printMar(){
        // System.out.println(super.culoare); --> variabilele private NU SE MOSTENESC!
        System.out.println(super.gust);
        System.out.println(super.greutate);
    }
    
}
