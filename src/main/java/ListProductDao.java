import java.util.ArrayList;
import java.util.List;

public class ListProductDao implements Products {

    private List<Product> products;

    public ListProductDao() {
        products= new ArrayList<>();
        products.add(new Product(1, 200, "Widget 1", "Some cool widget 1"));
        products.add(new Product(2, 100, "Widget 2", "Some cool widget 2"));
        products.add(new Product(3, 400, "Widget 3", "Some cool widget 3"));
    }

    //save
    public void save(Product p) {
        if(p.getId() == 0) {
            p.setId(products.size() +1);
            products.add(p);
        } else {
            int i = 0;
            for (Product product : products) {
                if (product.getId() == p.getId()) {
                    products.set(i, p);
                    break;
                }
                i++;
            }
        }
    }

    // delete
    public void deleteById(long id) {
        for(Product product : products) {
            if(product.getId() == id) {
                products.remove(product);
                break;
            }
        }
    }
//
    // fineOne()
    public Product findOne(long id) {
        for (Product product : products) {
            if (product.getId() == id){
                return product;
            }
        }
        return null;
    }

    // findAll()
    public List<Product> findAll(){
        return products;
    }

    // add new products
    // delete products
    // edit products
    // find one
    // find all

    public static void main(String[] args) {
        // TEST FIND ONE
        ListProductDao pdao = new ListProductDao();
//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST INSERT WITH SAVE
//        Product p2 = new Product("Wii", 400, "A casual experience");
//        pdao.save(p2);
//
//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // TEST UPDATE WITH SAVE
//        Product productToUpdate = pdao.findOne(3);
//        productToUpdate.setName("cool widget");
//        pdao.save(productToUpdate);

        // TEST DELETE AND FINDALL
//        pdao.deleteById(3);
//        for (Product p : pdao.products) {
//            System.out.println(p.getName());
//        }

        // FINDALL
        List<Product> existingProducts = pdao.findAll();

        for (Product p : existingProducts) {
            System.out.println(p.getName());
        }
    }

}
