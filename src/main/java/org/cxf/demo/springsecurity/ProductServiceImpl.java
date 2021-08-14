package org.cxf.demo.springsecurity;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author olysenko
 */
@Service
public class ProductServiceImpl implements ProductService {

   private List<Product> products = new ArrayList<>();
   private long id = 1;

   private ProductServiceImpl() {
      Product product = new Product();
      product.setId(id++);
      product.setDescription("Angular 8 course");
      products.add(product);
   }

   @Override
   public List<Product> getProducts() {
      return products;
   }

   @Override
   public long addProduct(Product product) {
      product.setId(id++);
      products.add(product);
      return product.getId();
   }
}
