<%@ page import="de.pfh.notebookwebapp.Notizbuch" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="de.pfh.notebookwebapp.Datenbankzugriff" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<h1><%
  try {
    Connection con = Datenbankzugriff.getConnection();

    Statement stm = con.createStatement();
    ResultSet rs = stm.executeQuery("SELECT * FROM Notizbuch");

    while(rs.next())
      out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3) + " " + rs.getString(4));
    con.close();


  } catch (SQLException | ClassNotFoundException e) {
    throw new RuntimeException(e);
  }
    //Notizbuch n = new Notizbuch();


%></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>