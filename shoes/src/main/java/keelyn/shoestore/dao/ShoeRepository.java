package keelyn.shoestore.dao;

import keelyn.shoestore.entities.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;




@Transactional
public interface ShoeRepository extends JpaRepository<Product,Integer> {
    List<Product> findAllByPriceGreaterThanEqual(double amount);
    List<Product> findTop10ByNameContainsOrderByPrice(String regex);
}
