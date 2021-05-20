package lesson3.repositories;

import lesson3.entites.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    List<Product> products = new ArrayList<>();

    public Product setProduct(int id, String title, int cost) {

        Product product = new Product();
        product.setId(id);
        product.setTitle(title);
        product.setCost(cost);
        products.add(product);
        return product;
    }

    public List<Product> productList(){
        return products;
    }
}
