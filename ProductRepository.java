package net.codejava.ProductDemo;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    void deleteProductById(Long id); //this is the query method because of the naming conversion on my Services

   // List<Product> listAll();
}
