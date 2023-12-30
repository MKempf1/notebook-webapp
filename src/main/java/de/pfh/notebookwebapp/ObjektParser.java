package de.pfh.notebookwebapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ObjektParser {

    public static ArrayList<Notizbuch> resultSetToNotizbuchListe(ResultSet resultSet){
        ArrayList<Notizbuch> notizbuchListe = new ArrayList<>();
        try {

            while (resultSet.next())   {
                Notizbuch notizbuch = new Notizbuch(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3));
                notizbuchListe.add(notizbuch);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return notizbuchListe;
    }
}
