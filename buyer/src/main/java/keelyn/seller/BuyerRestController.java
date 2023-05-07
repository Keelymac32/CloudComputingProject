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
import keelyn.seller.entities.Shoe;
import keelyn.seller.entities.creditcard;
import keelyn.seller.services.goToInventory;
import keelyn.seller.services.gotocheckout;


@RestController
@RequestMapping(value = "/buyer" )
public class BuyerRestController {
    
    public ArrayList<Shoe> cart = new ArrayList<Shoe>();


    private gotocheckout checkoutService = new gotocheckout();
    private goToInventory InventoryService = new goToInventory();

@Autowired

    @GetMapping()
    public String getCart(){
        return cart.toString();
    }

    @GetMapping("/inventory")
    public String GetInventory(){
       String inventory = InventoryService.gettingInventory();
       return inventory;
    }


    @GetMapping("/checkout")
    public Double Checkout(@Valid @RequestBody creditcard card){
        Double total = 0.0;
        total = checkoutService.gettingTotal(cart);
        return total;
}

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
    @DeleteMapping("/deleteall")
    public String deleteAllShoeCart(@Valid @RequestBody Shoe shoe){
        cart.removeAll(cart);
        return cart.toString();
    }

 }
