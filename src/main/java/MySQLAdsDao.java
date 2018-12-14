import com.mysql.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;

    // CONSTRUCTOR
    public MySQLAdsDao(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUsername(),
                    config.getPassword()

            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // SELECT
    @Override
    public List<Ad> all(){
        List<Ad> ads = new ArrayList<>();
        String selectQuery = "SELECT * FROM ads";
        try {

            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(selectQuery);
            while (rs.next()) {
                ads.add(new Ad(

                        rs.getInt("id"),
                        rs.getInt("user_id"),
                        rs.getString("title"),
                        rs.getString("description")

                ));
            }

        } catch(Exception e) {

            e.printStackTrace();

        }

        return ads;
    }
    @Override
    public Long insert(Ad ad) {

        long lastInsertId = 0;
        String insertQuery = String.format("INSERT INTO ads (id, user_id, title, description) VALUES ('%d', '%d', '%s', '%s')",
                ad.getId(),
                ad.getUserId(),
                ad.getTitle(),
                ad.getDescription());

        try {

            Statement stmt = connection.createStatement();
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            ResultSet keysRS = stmt.getGeneratedKeys();
            if (keysRS.next()) {

                lastInsertId = keysRS.getLong(1);

            }
        } catch (SQLException e) {

            e.printStackTrace();

        }

        return lastInsertId;
}


    public static void main(String[] args) {
        Ads adao = new MySQLAdsDao(new Config());
        Ads adao2 = new MySQLAdsDao(new Config());
            List<Ad> ads = adao.all();

            for(Ad ad : ads) {

                System.out.println(ad.getDescription());
                System.out.println(ad.getTitle());
                System.out.println(ad.getId());
                System.out.println(ad.getUserId());
                System.out.println();

            }
        }
}
