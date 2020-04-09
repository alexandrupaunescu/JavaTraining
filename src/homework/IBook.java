/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

import java.util.LinkedList;

/**
 *
 * @author Dinamo
 */
public class IBook extends ElectronicBook{
    private LinkedList<ElectronicBook.ElectronicBookReader> listOfReadingDevices = new LinkedList<>();

    public LinkedList<ElectronicBookReader> getListOfReadingDevices() {
        return listOfReadingDevices;
    }   
     
    public void printBook(){
        super.printBook();
        for(ElectronicBook.ElectronicBookReader currentReader: listOfReadingDevices){
            System.out.println("Book reader: "+currentReader);
        }
    }
}
