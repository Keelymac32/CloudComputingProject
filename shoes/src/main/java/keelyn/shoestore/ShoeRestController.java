package keelyn.shoestore;

import keelyn.shoestore.dao.ShoeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import keelyn.shoestore.entities.Shoe; 

import java.util.List;

@RestController
public class ShoeRestController {
    private ShoeRepository repository;


    @Autowired
    public ShoeRestController(ShoeRepository repository) {
        this.repository = repository;
    }

@GetMapping("/shoes")
public List<Shoe> getProducts(){
    return repository.findAll();
}

}
