package com.sci.bv;

import java.sql.*;

public class Main {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }
        getUpdate("fds","ds","2002-02-12");
        Connection conn = getConnection("mysql","Localhost","3306","books","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %12s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from authors");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "Name", "Email ", "Birthdate");
                do {
                    System.out.format(format, rs.getString("name"), rs.getString("email"), rs.getDate("birthdate"));
                } while (rs.next());
            } else {
                System.out.println("No results");
            }
        } catch (SQLException e) {
            System.err.println("Cannot execute query: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {  }
            if (st != null) try { st.close(); } catch (SQLException e) {  }
            try { conn.close(); } catch (SQLException e) { }
        }



    }

    public static  Connection getConnection(String type, String host, String port, String dbName, String user, String pw) {

        DriverManager.setLoginTimeout(60);  // wait 1 min; optional: DB may be busy, good to set a higher timeout
        try {
            String url = new StringBuilder()
                    .append("jdbc:")
                    .append(type)       // “mysql” / “db2” / “mssql” / “oracle” / ...
                    .append("://")
                    .append(host)
                    .append(":")
                    .append(port)
                    .append("/")
                    .append(dbName)
                    .append("?user=")
                    .append(user)
                    .append("&password=")
                    .append(pw).toString();
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.err.println("Cannot connect to the database: " + e.getMessage());
        }
            return null;



    }

    public static void getUpdate(String name,String email, String birthdate){
        Connection conn=getConnection("mysql","Localhost","3306","books","root","password");
        if (conn == null)
            return;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("insert into authors (name, email, birthdate) values (?, ?, ?)");
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setDate(3, Date.valueOf(birthdate));
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Cannot insert author: " + e.getMessage());
        } finally {
            if (ps != null) try { ps.close(); } catch (SQLException e) { }
        }

    }

}
