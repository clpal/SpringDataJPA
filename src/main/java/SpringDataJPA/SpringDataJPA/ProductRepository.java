package SpringDataJPA.SpringDataJPA;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Product findByName(String name);
    String deleteById(int id);
    Product save(Product product);


}
