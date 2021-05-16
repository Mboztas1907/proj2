import java.util.Date;

public class Kind {
    private String naam;
    private String achterNaam;
    private Date geboorteDatum;
    private String jongen;
    private String meisje;
    private Consument heeftEen;

    public Kind(String naam, String achterNaam, Date geboorteDatum,String jongen, String meisje){

    }

    public void setnaam(String naam) {
        this.naam= naam;
    }
    public void setAchterNaam(String achterNaam) {
        this.achterNaam= achterNaam;
    }
    public void setGeboorteDatum(Date geboorteDatum) {
        this.geboorteDatum = geboorteDatum;

    }
        public void setJongen(String jongen) {
        this.jongen= jongen;
    }
    public void setMeisje(String meisje){
        this.meisje= meisje;
    }


}

// class kind is verbonden met class consument.
// van kind wordt er in iedergeval de naam, geboortedatum en geslacht bijgehgouden.