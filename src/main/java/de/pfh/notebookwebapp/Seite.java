package de.pfh.notebookwebapp;
import java.util.Date;
import java.util.Vector;

public class Seite {

    private int SeitenID;
    private String Titel;
    private Date Erstellungsdatum = new Date();
    private Vector<Integer> AbsatzID = new Vector<Integer>();

    public Seite(int seitenID, String titel, Date erstellungsdatum, Vector<Integer> absatzID) {
        this.SeitenID = seitenID;
        this.Titel = titel;
        this.Erstellungsdatum = erstellungsdatum;
        this.AbsatzID = absatzID;
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

    public Vector<Integer> getAbsatzID() {
        return AbsatzID;
    }

    public void setAbsatzID(Vector<Integer> absatzID) {
        AbsatzID = absatzID;
    }
}
