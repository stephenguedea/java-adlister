import java.util.List;

public class JDBCtest {
    public static void main(String[] args) {
        MySQLAdsDao dao = new MySQLAdsDao(new Config());
        List<Ad> ads = dao.all();
//
            for(Ad ad : ads) {

                System.out.println(ads.get(1).getDescription());
                System.out.println(ads.get(1).getTitle());
                System.out.println(ads.get(1).getId());
                System.out.println(ads.get(1).getUserId());
                System.out.println(ad.getDescription());

            }
        }
    }

