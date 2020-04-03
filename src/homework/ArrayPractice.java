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
       // String[] ElectrnicBook =  new String[]{{EB1984 },{EBook2},{IBook1},{IBook2}};
        
       // String[] EBook1 = new String[]{};
       // String[] EBook2 = new String[]{};
        //String[] IBook1 = new String[]{};
        //String[] IBook2 = new String[]{};
        EBook[] x =  new EBook[2];
        x[0] = new EBook("BlackSwan", 2007,"EBook","978-0713999952","Nassim Nicholas Taleb", "https://www.bookrix.com/" );
        x[1] = new EBook("Antifragile", 2012,"EBook", "1-400-06782-0","Nassim Nicholas Taleb","https://www.bookrix.com/" );
        IBook[] y = new IBook[2];  
       //y[0] = new IBook();
        y[0] = new IBook("1984", 1949,"IBook","9780451524935","George Orwell", "https://www.bookrix.com/" );
        y[1] = new IBook("12 Rules for Life", 2018,"IBook", "978-0-345-81602-3", "Jordan Peterson","https://www.bookrix.com/" );
        //x[0] = new EBook(1949,ElectronicBook,"1984" )
     //new EBook ("BlakSwan", 2007,ElectronicBook),
    // new EBook ("Antifragil;", 1949,ElectronicBook),
       
        
     System.out.printf("#\tname\tYearOfPublication\tFormatOfElectronicBook\t\tIsbn\t\tAuthor\t\t\tDownloadLink\n");
     System.out.printf("-\t----\t-----------------\t----------------------\t\t----\t\t------\t\t\t------------\n");
    for ( int i = 0; i<x.length; i++){
    System.out.println("     "+ x[i].getName()+"       ,"+ x[i].getYearOfPublication()+"               ,"+x[i].getFormatOfElectronicBook()+"                ,"+x[i].getIsbn()+"   ,"+x[i].getAuthor()+"   ,"+x[i].getDownloadLink());
    System.out.println("     "+ y[i].getName()+"       ,"+ y[i].getYearOfPublication()+"               ,"+y[i].getFormatOfElectronicBook()+"                ,"+y[i].getIsbn()+"   ,"+y[i].getAuthor()+"   ,"+y[i].getDownloadLink());
    } 
    //"%d\t%s\t%d\t%s\t%s\t%s\t%s\n", x[i]
    //System.out.printf("%s\t%d\t%s\t%s\t%s\t%s\n", i, EBook[i]);
    
}}  
