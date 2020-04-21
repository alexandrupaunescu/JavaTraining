/*
 * clasa PunctGeografic, cu atributele latitudine si longitudine (tipul double), getteri si setteri pentru aceste atribute. Faceti validari in setteri, astfel incat sa permita valori intre -90 si 90 pentru latitudine si intre -180 si 180 pentru longitudine, altfel sa se initializeze cu 0. Clasa contine o metoda verifica(), care arunca o exceptie de tip CoordonateInvalide, in cazul in care atat latitudinea, cat si longitudinea sunt 0, asociind un mesaj sugestiv.
 */
package coordonateinvalide;

/**
 * clasa PunctGeografic, cu atributele latitudine si longitudine (tipul double), getteri si setteri pentru aceste atribute. 
 * Exista validari in setteri, astfel incat sa permita valori intre -90 si 90 pentru latitudine si intre -180 si 180 pentru longitudine, 
 * altfel sa se initializeze cu 0.0 . Clasa contine o metoda verifica(), care arunca o exceptie de tip CoordonateInvalide, 
 * in cazul in care atat latitudinea, cat si longitudinea sunt 0, asociind un mesaj sugestiv.
 * @author 
 */
public class PunctGeografic{
    // define constants limits for longitudine and latitudine
    public static String ERROR_MESSAGE_COORDINATES_ZERO = "Ambele coordonate sunt zero!";
    public static String ERROR_MESSAGE_LATITUDE_BELLOW_ZERO = "Ambele coordonate sunt zero!";
    public static String ERROR_MESSAGE_LONGITUDE_OVER_ZERO = "Ambele coordonate sunt zero!";
    public static double DEFAULT_VALUE = 0.0;
    public static double MIN_LAT = -90.0;
    public static double MAX_LAT = 90.0;
    public static double MIN_LON = -180.0;
    public static double MAX_LON = 180.0;
    // private variables longitudine si latitudine
    private double latitudine = DEFAULT_VALUE;
    private double longitudine = DEFAULT_VALUE;
    // define getters and setters
    public double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(double latitudine) {
        if(latitudine < MIN_LAT || latitudine > MAX_LAT)
            latitudine = DEFAULT_VALUE;
        this.latitudine = latitudine;
    }

    public double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(double longitudine) {
        if(longitudine < MIN_LON || longitudine > MAX_LON)
            latitudine = DEFAULT_VALUE;
        this.longitudine = longitudine;
    }
    /**
     verifica - daca cele doua coordonate sunt 0.0 arunca o exceptie
     * @exception CoordonateInvalide
     */
    public void verifica() throws CoordonateInvalide{
        if(latitudine ==DEFAULT_VALUE && longitudine == DEFAULT_VALUE)
            throw new CoordonateInvalide(ERROR_MESSAGE_COORDINATES_ZERO,null);
    }
}
