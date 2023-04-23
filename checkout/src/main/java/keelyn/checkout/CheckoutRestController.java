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
    private Double total = 0.0;


@Autowired
    
    @GetMapping("/total")
    public Double getTotal(){
        return total;
    }


    @PostMapping("/addcart")
    public void addShoeCart(@Valid @RequestBody List<Shoe> shoeList){
        total = 0.0; 
        for (Shoe item : shoeList){
            total = total + item.getPrice();
        }
    }
 }
