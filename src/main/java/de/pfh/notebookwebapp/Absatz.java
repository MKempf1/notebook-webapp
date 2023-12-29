package de.pfh.notebookwebapp;

import java.util.Date;
import java.util.Vector;


public class Absatz {

    private int absatzID;
    private String inhalt;
    private int bildID;
    private int seitenID;


    public Absatz(int absatzID, String inhalt, int bildID, int seitenID) {
        this.absatzID = absatzID;
        this.inhalt = inhalt;
        this.bildID = bildID;
        this.seitenID = seitenID;
    }

    public int getAbsatzID() {
        return absatzID;
    }

    public void setAbsatzID(int absatzID) {
        this.absatzID = absatzID;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public int getBildID() {
        return bildID;
    }

    public void setBildID(int bildID) {
        this.bildID = bildID;
    }

    public int getSeitenID() {
        return seitenID;
    }

    public void setSeitenID(int seitenID) {
        this.seitenID = seitenID;
    }
}
