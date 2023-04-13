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
       List.of(new Shoe(1,"Sneaker","Nike Pegasus",99.99,9),
       new Shoe(2,"Cleat", "Nike Hurrache Lax",119.99,5),
       new Shoe(3,"Sneaker","Nike Zoom Fly",79.99,10)))
       .forEach(System.out::println);
    
    
    }
}