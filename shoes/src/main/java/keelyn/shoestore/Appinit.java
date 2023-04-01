package keelyn.shoestore;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;
import keelyn.shoestore.dao.ShoeRepository;
import keelyn.shoestore.entities.Shoe;;

@Component
public class Appinit implements CommandLineRunner{

    private ShoeRepository repository;

    @Autowired 
    public Appinit(ShoeRepository repository){
        this.repository = repository;
    }



    @Override
    public void run(String... args) throws Exception {
        repository.saveAll(
        List.of(new Shoe(1,"Cleats", "Nike Lax", 100.00),
        new Shoe(2,"Sneakers", "Nike Pegasus", 94.99),
        new Shoe(3,"Sneakers", "Adidas Boost", 120.99)));
    }
}