package kodlama.io.ecommerce.api.controllers;

import kodlama.io.ecommerce.business.abstracts.ProductService;
import kodlama.io.ecommerce.entities.Product;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
@AllArgsConstructor
public class ProductController {
   private final ProductService service;

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
   public Product update (int id,Product product){
      return service.update(id,product);
   }
   @DeleteMapping("/{id}")
   @ResponseStatus(HttpStatus.NO_CONTENT)
   public  void delete(@PathVariable int id){
      service.delete(id);
   }

}
