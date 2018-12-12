import java.util.List;

//DAO'S BLUEPRINT
public interface Products {
    void save(Product product);
    void deleteById(long id);
    Product findOne(long id);
    List<Product> findAll();

}
