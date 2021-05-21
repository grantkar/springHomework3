package lesson3.controllers;

import lesson3.entites.Product;
import lesson3.sevice.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/showProduct")
    public String hello(Model uiModel, @ModelAttribute("product") Product product) {
        product = productService.getProductByID(1);
        uiModel.addAttribute("product", product);
        return "product";
    }

    @RequestMapping(path = "/showProductById", method = RequestMethod.GET)
    @ResponseBody
    public Product showProductById(Model uiModel, @RequestParam int id) {
        Product product = productService.getProductByID(id);
        return product;
    }

    @RequestMapping(path = "/setProduct", method = RequestMethod.POST)
    public void setProduct(@RequestBody Product product) {
    }

    @RequestMapping("/showForm")
    public String showSimpleForm(Model uiModel) {
        Product product = new Product();
        uiModel.addAttribute("product", product);
        return "product_form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("product") Product product) {
        productService.getListProduct().add(product);
        return "product-form-result";
    }

    @RequestMapping( value = "/allProduct", method = RequestMethod.GET)
    public String showAllProduct(Model model){
        model.addAttribute("products", productService.getListProduct());
        return "all-product";
    }
}
