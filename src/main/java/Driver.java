import javax.tools.Tool;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Driver {

    public static void main(String[] args) {
//        TODO AUTO-GENERATED METHOD STUB

        // SELECT
//        try {
//            // get to database
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/practice_db?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "Batman.27"
//            );
////             create a statement
//            Statement stmt = conn.createStatement();
//
////             execute SQL query
//            ResultSet rs = stmt.executeQuery("SELECT * FROM movies ORDER BY DIRECTOR");
//
////             process results
//            while (rs.next()) {
//                System.out.println(rs.getString("director") + " _ " + rs.getString("Title") + " ID: " + rs.getInt("id"));
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // INSERT
//        try {
//            // get to database
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/practice_db?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "Batman.27"
//            );
            // create a statement
//            Statement stmt = conn.createStatement();

            // execute SQL query with .executeUpdate()
            // don't need ResultSet rs for this...
//            stmt.executeUpdate(
//                    "INSERT INTO movies (title, release_year, director, genre) VALUES ('The Lords of the Ring: The Two Towers', 2002, " +
//                            "'George Lucas', 'Drama / Fantasty')",
//                    Statement.RETURN_GENERATED_KEYS
//            );
//
//            // NOW you nee ResultSet
//            ResultSet rs = stmt.getGeneratedKeys();
////
//            if (rs.next()){
//
//                System.out.println("Movie Enter!");
//                System.out.println(rs.getString("title"));
//            }
//
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        // =============================== DELETE

//        // open connection for DB
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/practice_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "Batman.27"
//        )) {
//
            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the query with .executeUpdate() method since it is using DML
//            stmt.executeUpdate("DELETE FROM movies WHERE id = 23");
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

            // ========================= UPDATE
            // open connection for DB
//        try (Connection conn = DriverManager.getConnection(
//                "jdbc:mysql://localhost/practice_db?serverTimezone=UTC&useSSL=false",
//                "root",
//                "Batman.27"
//        )) {
//
//            // create the statement object
//            Statement stmt = conn.createStatement();
//
//            // execute the query with .executeUpdate()
//            int recordsChanged = stmt.executeUpdate("UPDATE movies SET director = 'Peter Jackson' WHERE title = 'The Lords of the Ring: The Two Towers'");
//            System.out.println(recordsChanged);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }


        // SELECT
        try {
            // get to database
            Connection conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost/practice_db?serverTimezone=UTC&useSSL=false",
                    "root",
                    "Batman.27"
            );
//             create a statement
            Statement stmt = conn.createStatement();

//             execute SQL query
            ResultSet rs = stmt.executeQuery("SELECT * FROM movies ORDER BY id");

//             process results
            while (rs.next()) {
                System.out.println(rs.getString("director") + " _ " + rs.getString("Title") + " ID: " + rs.getInt("id"));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
