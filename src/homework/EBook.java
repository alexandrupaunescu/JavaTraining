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
public class EBook {
    private String _name;
    private int _yearOfPublication;
    private String _formatOfElectronicBook;
    private String _isbn;
    private String _author;
    private String _downloadLink;

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public int getYearOfPublication() {
        return _yearOfPublication;
    }

    public void setYearOfPublication(int _yearOfPublication) {
        this._yearOfPublication = _yearOfPublication;
    }

    public String getFormatOfElectronicBook() {
        return _formatOfElectronicBook;
    }

    public void setFormatOfElectronicBook(String _formatOfElectronicBook) {
        this._formatOfElectronicBook = _formatOfElectronicBook;
    }

    public String getIsbn() {
        return _isbn;
    }

    public void setIsbn(String _isbn) {
        this._isbn = _isbn;
    }

    public String getAuthor() {
        return _author;
    }

    public void setAuthor(String _author) {
        this._author = _author;
    }

    public String getDownloadLink() {
        return _downloadLink;
    }

    public void setDownloadLink(String _downloadLink) {
        this._downloadLink = _downloadLink;
    }
    
    
    public EBook(String name,
                 int yearOfPublication,
                 String formatOfElectronicBook,                                  
                 String isbn,
                 String author,
                 String downloadLink){
    this._name = name;
    this._formatOfElectronicBook = formatOfElectronicBook ;
    this._yearOfPublication = yearOfPublication;
    this._isbn = isbn;
    this._author = author;
    this._downloadLink = downloadLink;
    
    }
/*
    
    public String Name(){
    return this._name;
    }
    public String FormatOfElectronicBook(){
        return this._formatOfElectronicBook;
    }
    public int YearOfPublication(){
    return this._yearOfPublication;
    }
    public String Isbn(){
    return this._isbn;
    }
    public String Author(){
    return this._author;
    } 
    public String DownloadLink(){
    return this._downloadLink;
    }
    */
    
    
}
