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
        return "Your Cart: " + "\n" + cart.toString();
    }

    @GetMapping("/inventory")
    public String GetInventory(){
       String inventory = InventoryService.gettingInventory();
       return inventory;
    }


    @GetMapping("/checkout")
    public String Checkout(@Valid @RequestBody creditcard card){
        Double total = 0.0;
        total = checkoutService.gettingTotal(cart);
        String CartTotal = "Cart Total = $" + total ;
        String Tokenized = "**** **** **** ";
        String Id = String.valueOf(card.getId());
        String finalId = Tokenized + Id.substring(Id.length() - 4);
        String cardinfo = "Your Card Info : " + card.getName() + ", " + finalId + ", " + card.getDate();


        return cart.toString() + "\n" + CartTotal + "\n"  + cardinfo;
}

    @PostMapping()
    public String addShoeCart(@Valid @RequestBody Shoe shoe){
        cart.add(shoe);
        return shoe.toString() + "Successfully Added To Cart";

}

    @DeleteMapping()
    public String deleteShoeCart(@Valid @RequestBody Shoe shoe){
        cart.remove(shoe);
        return shoe.toString() + "Successfully Deleted From Cart";
    }
    @DeleteMapping("/deleteall")
    public String deleteAllShoeCart(@Valid @RequestBody Shoe shoe){
        cart.removeAll(cart);
        return "Your Cart Has Been Emptied";
    }

 }
