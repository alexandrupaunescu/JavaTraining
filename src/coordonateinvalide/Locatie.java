/*
 * Clasa Locatie mosteneste clasa PunctGeografic si adauga atributul nume (tipul String), getter si setter pentru acesta. 
In clasa se redefineste metoda verifica(), care va arunca exceptie de tipul CoordonateInvalide daca latitudinea este <=0 sau daca longitudinea <=0, 
asociind un mesaj corespunzator fiecarei situatii.
Redefiniti in aceasta clasa metoda toString(), pentru a returna sub forma de string toate valorile atributelor clasei.
 */
package coordonateinvalide;

/**
 * Clasa Locatie mosteneste clasa PunctGeografic si adauga atributul nume (tipul String), getter si setter pentru acesta. 
In clasa se redefineste metoda verifica(), care va arunca exceptie de tipul CoordonateInvalide daca latitudinea este mai mic sau egal 0 sau daca longitudinea 
* mai mic sau egala cu 0, asociind un mesaj corespunzator fiecarei situatii.
Redefiniti in aceasta clasa metoda toString(), pentru a returna sub forma de string toate valorile atributelor clasei.
 * @author GAP
 */
public class Locatie extends PunctGeografic{
    private static String DEFAULT_STRING_VALUE = "";
    private String nume = DEFAULT_STRING_VALUE;
    // setters and getters
    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
    /**
     verifica - 
     * @exception CoordonateInvalide
     */
    @Override
    public void verifica() throws CoordonateInvalide{
        if(this.getLatitudine() <= PunctGeografic.DEFAULT_VALUE)
            throw new CoordonateInvalide(PunctGeografic.ERROR_MESSAGE_LATITUDE_BELLOW_ZERO,null);
        if(this.getLongitudine() >= PunctGeografic.DEFAULT_VALUE)
            throw new CoordonateInvalide(PunctGeografic.ERROR_MESSAGE_LONGITUDE_OVER_ZERO,null);
    }
    /**
     toString()
     * @return attributes as string
     */
    public String toStriing(){
        return("Name: "+this.getNume()+", latitude: "+this.getLatitudine()+" longitude: "+this.getLongitudine());
    }
}
