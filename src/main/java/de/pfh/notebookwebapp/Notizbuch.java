package de.pfh.notebookwebapp;

import java.util.Date;

public class Notizbuch {
    private int notizbuchID;
    private String name;

    private Date erstellungsdatum = new Date();


    public Notizbuch(int notizbuchID, String name, Date erstellungsdatum) {
        this.notizbuchID = notizbuchID;
        this.name = name;
        this.erstellungsdatum = erstellungsdatum;
    }

    public int getNotizbuchID(int i) {
        return notizbuchID;
    }

    public void setNotizbuchID(int notizbuchID) {
        this.notizbuchID = notizbuchID;
    }

    public String getName(int i) {
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

}
