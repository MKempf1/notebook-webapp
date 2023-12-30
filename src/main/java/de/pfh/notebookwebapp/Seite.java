package de.pfh.notebookwebapp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;

public class Seite {

    private int SeitenID;
    private String Titel;
    private Date Erstellungsdatum = new Date();

    public Seite(int seitenID, String titel, Date erstellungsdatum, ArrayList<Integer> absatzID) {
        this.SeitenID = seitenID;
        this.Titel = titel;
        this.Erstellungsdatum = erstellungsdatum;
    }

    public int getSeitenID() {
        return SeitenID;
    }

    public void setSeitenID(int seitenID) {
        SeitenID = seitenID;
    }

    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) {
        Titel = titel;
    }

    public Date getErstellungsdatum() {
        return Erstellungsdatum;
    }

    public void setErstellungsdatum(Date erstellungsdatum) {
        Erstellungsdatum = erstellungsdatum;
    }

}
