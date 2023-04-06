package keelyn.stars;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import keelyn.stars.dao.StarRepository;
import keelyn.stars.entities.Shoe;;

@Component
public class Appinit implements CommandLineRunner{

    private StarRepository repository;

    @Autowired 
    public Appinit(StarRepository repository){
        this.repository = repository;
    }



    @Override
    public void run(String... args) throws Exception {
        
        Shoe deletion = new Shoe(4, "Cleat", "Adidas Soccer Cleat", 100.00);
        repository.saveAll(
       List.of(new Shoe(1,"Sneaker","Nike Pegasus",99.99),
       new Shoe(2,"Cleat", "Nike Hurrache Lax",119.99),
       new Shoe(3,"Sneaker","Nike Zoom Fly",79.99), deletion))
       .forEach(System.out::println);
    
        
        repository.deleteById(4);;

        List<Shoe> shoes = new ArrayList<Shoe>();
        repository.findAll().forEach(shoe -> shoes.add(shoe));
        System.out.println(shoes);

    }
}
