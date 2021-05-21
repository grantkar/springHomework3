package lesson3.sevice;

import lesson3.entites.Product;
import lesson3.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product getProductByID(int id) {
        Product product = productRepository.getProductById(id);
        return product;
    }

    public List<Product> getListProduct(){
        return productRepository.productList();
    }

    public ProductService() {
    }
}
