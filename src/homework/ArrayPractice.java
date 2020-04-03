/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework;

/**
 *
 * @author Dinamo
 */
public class ArrayPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create the array of books
        ElectronicBook[] x =  new ElectronicBook[2];
        // create and add book to array
        EBook book1 = new EBook();
        book1.getAutors().add("Nassim Nicholas Taleb");
        book1.getAutors().add("Alexandru Paunescu");
        book1.getAutors().add("https://www.bookrix.com/");
        book1.setTitle("BlackSwan");
        book1.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2018);
        book1.setISBN("978-0713999952");
        book1.setPrice((float)12.35);
        book1.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.Kindle);
        book1.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.pdfReader);
        x[0] = book1;
        // create and add book to array
        IBook book2 = new IBook();
        book2.getAutors().add("Alexandru Paunescu");
        book2.getAutors().add("https://www.bookrix.com/");
        book2.setTitle("WhiteSwan");
        book2.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2020);
        book2.setISBN("978-0713999954");
        book2.setPrice((float)25.35);
        book2.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPad);
        book2.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPhone);
        x[1] = book2;
    //printing all books
    for ( int i = 0; i<x.length; i++){
        x[i].printBook();
        System.out.println("================================");
    } 
    //"%d\t%s\t%d\t%s\t%s\t%s\t%s\n", x[i]
    //System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\n", i, EBook[i]);
    
}}  
