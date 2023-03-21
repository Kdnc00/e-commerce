package kodlama.io.ecommerce.api.controllers;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.entities.concretes.Product;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
   private final ProductService service;
   public ProductController(ProductService service){
      this.service=service;
   }
   @GetMapping
   public List<Product> getAll(){
      return service.getAll();
   }
   @GetMapping("/{id}")
   public Product getById(@PathVariable int id){
      return service.getById(id);
   }
   @PostMapping
   @ResponseStatus(HttpStatus.CREATED)
   public Product add(@RequestBody Product product){
      return service.add(product);
   }
   @PutMapping("/{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
   public  void delete(@PathVariable int id){
      service.delete(id);
   }

}