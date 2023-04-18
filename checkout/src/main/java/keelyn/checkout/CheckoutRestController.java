package keelyn.checkout;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import keelyn.checkout.entities.Shoe;
import keelyn.checkout.entities.creditcard;

@RestController
@RequestMapping(value = "/checkout" )
@SpringBootApplication
public class CheckoutRestController {
    
    public ArrayList<Shoe> cart = new ArrayList<Shoe>();
    


@Autowired
    
    @GetMapping()
    public String getCart(){
        return "Hello";
    }


    @PostMapping()
    public Double addShoeCart(@Valid @RequestBody List<Shoe> shoeList){
        Double total = 0.0;
        for (Shoe item : shoeList){
            total = total + item.getPrice();
        }
        return total;
    }
 }
