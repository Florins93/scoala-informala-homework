package com.sci.bv;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String query ="";
        query="insert into profs(profname) values (\"Iordan\");";
        executeQuery(query);

        System.out.println("Classes");
       selectClasses();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Courses");
      selectCourses();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Crosslistings");
      selectCrosslistings();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("CoursesProfs");
       selectCoursesProfs();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Profs");
       selectProfs();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Select a id to display data for that course");
        Scanner scan =new Scanner(System.in);
        int id=scan.nextInt();
        selectDataFromACourseWithSpecificId(id);
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Data From All Classes Whose Title Begin With 'Intro'");
        selectDataFromAllClassesWhoseTitleBeginWithIntro();
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Display data from all classes whose dept is cos and coursenum begin with 3");
        selectDataFromAllClassesWhoseSpecificDeptAndCoursenum();




    }


        //make a method to show all data from  courses
    public static void selectCourses(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "area ", "title","descrip","prereqs");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs"));
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


    //make a method to show all data from  classes table
    public static void selectClasses(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s  %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from classes");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "course_id ", "days","starttime","endtime","roomnun");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getInt("course_id"),
                            rs.getString("days"),
                            rs.getString("starttime"),
                            rs.getString("endtime"),
                            rs.getInt("roomnun"));
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


    //make a method to show all data from  crosslistings table
    public static void selectCrosslistings(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from crosslistings");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "dept ", "coursenum","course_id");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getString("dept"),
                            rs.getInt("coursenum"),
                            rs.getInt("course_id")
                            );
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


    //make a method to show all data from  coursesprofs table
    public static void selectCoursesProfs(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from coursesprofs");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "course_id", "prof_id");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getInt("course_id"),
                            rs.getInt("prof_id"));
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


    //make a method to show all data from profs table
    public static void selectProfs(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from profs");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "profname");
                do {
                    System.out.format(format, rs.getInt("id"), rs.getString("profname"));
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


    // //make a method to show all data from courses with an id which we choose
    public static void selectDataFromACourseWithSpecificId(int id){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("select * from courses where id="+id);
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "area ", "title","descrip","prereqs");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs"));
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


     // //make a method to show all data from all classes whose title begin with intro
    public static void selectDataFromAllClassesWhoseTitleBeginWithIntro(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s    %20s    %20s    %20s   %20s    %20s    %20s    %20s\n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery( "select * from courses join classes ON (courses.id = classes.course_id) where title like\"intro%\";");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "area ", "title","descrip","prereqs","id","course_id","days","starttime","endtime","roomnun");
                do {
                    System.out.format(format, rs.getInt("id"), rs.getString("area"), rs.getString("title"),
                            rs.getString("descrip"), rs.getString("prereqs"),
                            rs.getInt("id"), rs.getInt("course_id"),
                            rs.getString("days"), rs.getString("starttime"),
                            rs.getString("endtime"), rs.getInt("roomnun"));
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


    //make a method who execute a query which we choose
    public static void executeQuery(String query){
        Connection conn=getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null)
            return;

        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(query);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.err.println(" " + e.getMessage());
        } finally {
            if (ps != null) try { ps.close(); } catch (SQLException e) { }
        }

    }


    //make a method who show all data from all classes whose dept is cos and coursenum negin with 3
    public static void selectDataFromAllClassesWhoseSpecificDeptAndCoursenum(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e){
            System.err.println("Can’t load driver. Verify CLASSPATH");
            System.err.println(e.getMessage());
        }

        Connection conn = getConnection("mysql","Localhost","3306","school","root","password");
        if (conn == null) return;
        Statement st = null;
        ResultSet rs = null;
        final String format = "%20s   %20s    %20s    %20s     %20s   %20s    %20s    %20s     %20s   %20s    %20s    %20s    %20s   %20s    %20s \n";
        try {
            st = conn.createStatement();
            rs = st.executeQuery("    select * from courses join crosslistings ON (courses.id=crosslistings.course_id) join classes ON" +
                    "(courses.id=classes.course_id) where dept=\"cos\" and coursenum like\"3%\";\n");
            boolean hasResults = rs.next();
            if (hasResults) {
                System.out.format(format, "id", "area ", "title","descrip","prereqs","id","dept","coursenum","course_id","id","course_id",
                        "days","starttime","endtime","roomnun");
                do {
                    System.out.format(format, rs.getInt("id"),
                            rs.getString("area"),
                            rs.getString("title"),
                            rs.getString("descrip"),
                            rs.getString("prereqs"),
                            rs.getInt("id"),
                            rs.getString("dept"),
                            rs.getInt("coursenum"),
                            rs.getInt("course_id"),
                            rs.getInt("id"),
                            rs.getInt("course_id"),
                            rs.getString("days"),
                            rs.getString("starttime"),
                            rs.getString("endtime"),
                            rs.getString("roomnun")
                    );
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


    //making a connection to our databse
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



}
