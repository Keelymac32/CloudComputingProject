package keelyn.seller;

import java.util.ArrayList;

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
import keelyn.seller.entities.*;



@RestController
@RequestMapping(value = "/seller" )
@SpringBootApplication
public class SellerRestController {
    
    public ArrayList<Shoe> cart = new ArrayList<Shoe>();
     
        // Initialize an ArrayList with add()

@Autowired
   //hard coded shoes that will be pulled instead form check out 
    

    @GetMapping()
    public String getCart(){
        //Call to the inventory database will return items in the inventory 
        return cart.toString();
    }

    @GetMapping()
    public String checkOut(@Valid @RequestBody creditcard card ){
        //call to check out microservice
        return card.toString();
    }


// Method that adds a shoe to the inventory 
    @PostMapping()
    public Shoe addShoeCart(@Valid @RequestBody Shoe shoe){
        cart.add(shoe);
        return shoe;

}



    @DeleteMapping()
    public String deleteShoeCart(@Valid @RequestBody Shoe shoe){
        cart.remove(shoe);
        return cart.toString();
    }

    @DeleteMapping()
    public String deleteAllCart(){
        cart.removeAll(cart);
        return cart.toString();
    }



 }
