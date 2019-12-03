package vinkr.vinkit;

import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ArtikkeliVinkki implements Vinkki {

    public static final String NL = System.getProperty("line.separator");
    private String id;
    private String otsikko;
    private String tyyppi = "artikkeli";
    private String tekija = ""; // Tekijän nimi tallennetaan muodossa "Sukunimi, Etunimi"
    private String julkaisu = "";
    private Date julkaisupvm = null;
    private URL url = null; 

    public ArtikkeliVinkki(URL url, String otsikko, String tekija) {
        this.id = luoID();
        this.otsikko = otsikko;
        this.tekija = tekija;
        this.url = url;
    }
    
    // Getterit
    @Override
    public String getID() {
        return this.id;
    }

    @Override
    public String getOtsikko() {
        return this.otsikko;
    }

    @Override
    public String getTyyppi() {
        return this.tyyppi;
    }

    public String getTekija() {
        return this.tekija;
    }

    public String getTekijanSukunimi() {
        return this.tekija.substring(0, this.tekija.indexOf(","));
    }

    public String getTekijanEtunimi() {
        return this.tekija.substring(this.tekija.indexOf(",") + 2);
    }
    
    public String getJulkaisu() {
        return this.julkaisu;
    }

    public Date getJulkaisupvm() {
        return this.julkaisupvm;
    }
    
    public URL getUrl() {
        return this.url;
    }

    // Setterit
    @Override
    public void setOtsikko(String otsikko) {
        this.otsikko = otsikko;
    }

    public void setTekija(String tekija) {
        this.tekija = tekija;
    }

    public void setJulkaisu(String julkaisu) {
        this.julkaisu = julkaisu;
    }

    public void setJulkaisupvm(Date julkaisupvm) {
        this.julkaisupvm = julkaisupvm;
    }
    
    public void setUrl(URL url) {
        this.url = url;
    }
    
    @Override
    public String tulosta() {
        // TODO Auto-generated method stub
        return null;
    }

    
 // Apumetodit
    private String luoID() {
        Date nykyhetki = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
        String id = ft.format(nykyhetki);
        return id;
    }
    
}
