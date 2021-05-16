import java.util.Date;

public class Kind {
    private String naam;
    private String geboorteDatum;
    private String geslacht;

    public Kind(String naam, String geboorteDatum, String geslacht) {
        this.naam = naam;
        this.geboorteDatum = geboorteDatum;
        this.geslacht = geslacht;
    }

    public String getGeboorteDatum() {
        return geboorteDatum;
    }

    public String getNaam() {
        return naam;
    }

    public String getGeslacht() {
        return geslacht;
    }
}





// class kind is verbonden met class consument.
// van kind wordt er in iedergeval de naam, geboortedatum en geslacht bijgehgouden.