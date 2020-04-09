/*
 * Electronic Book class
 */
package homework;

import java.util.LinkedList;

/**
 * ElectronicBook class
 * @author GAP
 */
public class ElectronicBook {
    public static String DEFAULT_STRING_NAME = "Default String Value";
    public static float DEFAULT_PRICE = (float)0.0;
    public enum YearOfPublication {Y_2016,Y_2017,Y_2018,Y_2019,Y_2020};
    public enum FormatOfElectronicBook {iBook,eBook,PDF};
    public enum ElectronicBookReader {iPad,iPhone,Kindle, pdfReader};
    private String title = DEFAULT_STRING_NAME;
    private String ISBN = DEFAULT_STRING_NAME;
    private LinkedList<String> autors = new LinkedList<>();
    private LinkedList<String> downloadLinks = new LinkedList<>();
    private LinkedList<String> remarksAndNotes = new LinkedList<>();
    private String publisher = DEFAULT_STRING_NAME;
    private float price = DEFAULT_PRICE;
    private FormatOfElectronicBook electronicFormat = FormatOfElectronicBook.PDF;
    private YearOfPublication yearOfPublicatiob = YearOfPublication.Y_2019;
    //methods
    public void printBook(){
        System.out.println("Book title: "+ title);
        System.out.println("Book ISBN: "+ ISBN);
        //System.out.println("Book publisher: "+ publisher);
        System.out.println("Book year of publication : " + yearOfPublicatiob);
        System.out.println("Book price: "+ price);
        for(String currentAuthor: autors){
            System.out.println("Book author: "+currentAuthor);
        }
        for(String currentRemarkOrNote: remarksAndNotes){
            System.out.println("Book note: "+currentRemarkOrNote);
        }        
        for(String currentDownloadLink: remarksAndNotes){
            System.out.println("Book download link: "+currentDownloadLink);
        }        
    }
    public String getTitle() {
        return title;
    }

    public String getISBN() {
        return ISBN;
    }

    public LinkedList<String> getAutors() {
        return autors;
    }

    public LinkedList<String> getDownloadLinks() {
        return downloadLinks;
    }

    public LinkedList<String> getRemarksAndNotes() {
        return remarksAndNotes;
    }

    public String getPublisher() {
        return publisher;
    }

    public float getPrice() {
        return price;
    }

    public FormatOfElectronicBook getElectronicFormat() {
        return electronicFormat;
    }

    public YearOfPublication getYearOfPublicatiob() {
        return yearOfPublicatiob;
    }
    //setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setRemarksAndNotes(LinkedList<String> remarksAndNotes) {
        this.remarksAndNotes = remarksAndNotes;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setYearOfPublicatiob(YearOfPublication yearOfPublicatiob) {
        this.yearOfPublicatiob = yearOfPublicatiob;
    }
    
}
