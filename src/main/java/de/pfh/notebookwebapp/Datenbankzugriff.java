package de.pfh.notebookwebapp;

import java.sql.*;

public class Datenbankzugriff {
    //private static final String URL = "jdbc:mysql://localhost:3306/Notizbuch";                                                                    123mysql-server-rootPW!?!
       private static final String url = "jdbc:mysql://localhost:3306/Notizbuch";
      private static final String username = "root";
      private static final String password = "123mysql-server-rootPW!?!";
      public static void main(String[] args) {


        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from Notizbuch");


//            while(resultSet.next()){
//                System.out.println("NotizbuchID: " + resultSet.getInt(1) +'\n' +
//                                   "NotizbuchName: " + resultSet.getString(2) +'\n' +
//                                   "Erstellungsdatum: " + resultSet.getString(3) +'\n' +
//                                   "AnzahlSeiten: " + resultSet.getInt(4));
//            }

            connection.close();
        }

        catch (Exception e){

            System.out.println(e);
        }
    }
}

