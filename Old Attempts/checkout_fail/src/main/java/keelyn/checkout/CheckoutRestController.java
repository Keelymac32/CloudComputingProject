package keelyn.checkout;

import java.util.ArrayList;
import java.util.*;

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
@RequestMapping(value = "/checkout")
@SpringBootApplication
public class CheckoutRestController {
    
    private List<creditcard> creditcards = new ArrayList<creditcard>();
     
        // Initialize an ArrayList with add()

    @Autowired
   //hard coded shoes that will be pulled instead form check out 
    
/* 
    @GetMapping()
    public Double getFinalPrice(@RequestParam List<String> checkoutcart){
        Double total = 0.0;
        /*for (Shoe item : checkoutcart){
            total = total + item.getPrice();
        }
        return total;
    }*/

   

    @PostMapping()
    public Shoe addShoeCart(@Valid @RequestBody Shoe shoe){
        //cart.add(shoe);
        return shoe;

}


// Method that adds a shoe to the inventory 
    @PostMapping()
    public creditcard validateCredit(@Valid @RequestBody creditcard creditcard){
        creditcards.add(creditcard);
        return creditcard;}


 }
