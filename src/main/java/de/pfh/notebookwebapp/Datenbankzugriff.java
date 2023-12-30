package de.pfh.notebookwebapp;

import java.sql.*;
import java.util.ArrayList;
import java.util.Vector;

public class Datenbankzugriff {
    //private static final String URL = "jdbc:mysql://localhost:3306/Notizbuch";                                                                    123mysql-server-rootPW!?!
       private static final String url = "jdbc:mysql://localhost:3306/Notizbuch";
      private static final String username = "root";
      private static final String password = "123mysql-server-rootPW!?!";
      private static ArrayList<Notizbuch> Notizbuchliste = new ArrayList<>();

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Notizbuch");

            Notizbuchliste = ObjektParser.resultSetToNotizbuchListe(resultSet);

            for (int i = 0; i < Notizbuchliste.size(); i++) {

                System.out.println("NotizbuchID: " + Notizbuchliste.get(i).getNotizbuchID(i) +
                        ", NotizbuchName: " + Notizbuchliste.get(i).getName(i) +
                        ", Erstellungsdatum: " + Notizbuchliste.get(i).getErstellungsdatum());
            }

            connection.close();
        }

        catch (Exception e){

            System.out.println(e);
        }
    }
}

