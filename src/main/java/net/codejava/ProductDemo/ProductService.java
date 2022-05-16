package net.codejava.ProductDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    private ProductRepository productrepo;

    public List<Product> listAll() {
        return  productrepo.findAll();
    }

    public Product addProduct(Product product) {

        productrepo.save(product);
        return product;
    }

    public Product findProductByID(Long id) throws UserPrincipalNotFoundException {
        return productrepo.findById(id).orElseThrow(()-> new UserPrincipalNotFoundException("product " +id+" was not found"));

    }

    public Product updateProduct(Long id) {
        return productrepo.findById(id).get();
    }

     public void delete(Long id) {

        productrepo.deleteById(id);

     }


}
