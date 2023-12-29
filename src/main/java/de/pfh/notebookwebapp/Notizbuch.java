package de.pfh.notebookwebapp;

import java.util.Date;
import java.util.Vector;

public class Notizbuch {
    private int notizbuchID;
    private String name;

    private Date erstellungsdatum = new Date();
    private Vector<Integer> seitenID = new Vector<Integer>();


    public Notizbuch(int notizbuchID, String name, Date erstellungsdatum, Vector<Integer> seitenID) {
        this.notizbuchID = notizbuchID;
        this.name = name;
        this.erstellungsdatum = erstellungsdatum;
        this.seitenID = seitenID;
    }

    public int getNotizbuchID() {
        return notizbuchID;
    }

    public void setNotizbuchID(int notizbuchID) {
        this.notizbuchID = notizbuchID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getErstellungsdatum() {
        return erstellungsdatum;
    }

    public void setErstellungsdatum(Date erstellungsdatum) {
        this.erstellungsdatum = erstellungsdatum;
    }

    public Vector<Integer> getSeitenID() {
        return seitenID;
    }

    public void setSeitenID(Vector<Integer> seitenID) {
        this.seitenID = seitenID;
    }
}
