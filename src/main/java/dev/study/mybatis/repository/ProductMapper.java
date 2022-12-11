package dev.study.mybatis.repository;

import dev.study.mybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
    Product selectProductById(Long id);

    List<Product> selectAllProducts();

    void insertProduct(Product product);
}
