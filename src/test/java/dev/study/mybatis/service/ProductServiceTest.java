package dev.study.mybatis.service;

import dev.study.mybatis.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void getProductById() {
        Product product = productService.getProductById(1L);
        System.out.println("product = " + product);
    }

    @Test
    public void getAllProducts() {
        List<Product> product = productService.getAllProducts();
        System.out.println("product = " + product);
    }


    @Transactional
    @Test
    public void addProduct() {
        productService.addProduct(new Product("쿤달 샴푸", 42000));
        productService.addProduct(new Product("양말", 2000));
    }
}
