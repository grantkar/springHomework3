package lesson3.repositories;

import lesson3.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> products = new ArrayList<Product>();

    public ProductRepository() {
        products.add(new Product(0,"Шуруповерт", 5000));
        products.add(new Product(1,"Перфоратор", 10000));
    }

    public Product setProduct(int id, String title, int cost) {

        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setCost(cost);
        products.add(product);
        return product;
    }

    public Product getProductById(int id){
        for (int i = 0; i < products.size(); i++) {
            if (id == i) {
                return products.get(i);
            }
        }
        return null;
    }

    public List<Product> productList(){
        return products;
    }
}
