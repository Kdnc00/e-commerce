package kodlama.io.ecommerce.repository;

import kodlama.io.ecommerce.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product,Integer>{

}
