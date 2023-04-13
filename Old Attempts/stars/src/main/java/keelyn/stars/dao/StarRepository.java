package keelyn.stars.dao;

import keelyn.stars.entities.Shoe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;




@Transactional
public interface StarRepository extends JpaRepository<Shoe,Integer> {
    List<Shoe> findAllByPriceGreaterThanEqual(double amount);
    List<Shoe> findTop10ByNameContainsOrderByPrice(String regex);
}