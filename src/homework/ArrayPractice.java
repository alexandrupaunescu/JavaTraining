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
        ElectronicBook[] x =  new ElectronicBook[4];
        // create and add book to array
        EBook book1 = new EBook();
        book1.getAutors().add("Nassim Nicholas Taleb");
        book1.getAutors().add("Alexandru Paunescu");
        book1.getDownloadLinks().add("https://www.bookrix.com/");
        book1.setTitle("BlackSwan");
        book1.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2018);
        book1.setISBN("978-0713999952");
        book1.setPrice((float)12.95);
        book1.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.Kindle);
        book1.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.pdfReader);
        x[0] = book1;
        // create and add book to array
        EBook book2 = new EBook();
        book2.getAutors().add("Alexandru Paunescu");
        book2.getDownloadLinks().add("https://www.bookrix.com/");
        book2.setTitle("WhiteSwan");
        book2.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2017);
        book2.setISBN("978-0713999954");
        book2.setPrice((float)25.35);
        book2.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.Kindle);
        book2.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPhone);
        x[1] = book2;
        // create and add book to array
        IBook book3 = new IBook();
        book3.getAutors().add("George Orwell");
        book3.getDownloadLinks().add("https://www.bookrix.com/");
        book3.setTitle("1984");
        book3.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2020);
        book3.setISBN("978-0713999");
        book3.setPrice((float)35.35);
        book3.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.Kindle);
        book3.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPad);
        book3.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPhone);
        x[2] = book3;
        // create and add book to array
        IBook book4 = new IBook();
        book4.getAutors().add("Jordan Peterson");
        book4.getDownloadLinks().add("https://www.bookrix.com/");
        book4.setTitle("12 Rules for Life");
        book4.setYearOfPublicatiob(ElectronicBook.YearOfPublication.Y_2020);
        book4.setISBN("978-0713999888SSS");
        book4.setPrice((float)22.15);
        book4.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPad);
        book4.getListOfReadingDevices().add(ElectronicBook.ElectronicBookReader.iPhone);
        x[3] = book4;
    //printing all books
    for ( int i = 0; i<x.length; i++){
        x[i].printBook();
        System.out.println("================================");
    } 
    
    
}}  
