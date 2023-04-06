package keelyn.stars;

import keelyn.stars.dao.StarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import keelyn.stars.entities.Shoe; 

import java.util.List;

@RestController
public class StarsRestController {
    private StarRepository repository;


    @Autowired
    public StarsRestController(StarRepository repository) {
        this.repository = repository;
    }

@GetMapping("/stars")
public List<Shoe> getProducts(){
    return repository.findAll();
}

}
