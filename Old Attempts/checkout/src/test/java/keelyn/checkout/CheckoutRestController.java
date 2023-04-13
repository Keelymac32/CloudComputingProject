package keelyn.checkout;

import keelyn.checkout.entities.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@SpringBootApplication
public class CheckoutRestController {
    

    
    
@Autowired
   //hard coded shoes that will be pulled instead form check out 
    
    


    @GetMapping("/checkout")
    public String CheckOut(){

    //I want this to show all the shoes that have been added to the check out database as well as the total  
        
    //Call to the cart database will return items in the cart 
        ArrayList<Shoe> cart = new ArrayList<Shoe>();
        cart.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
        cart.add(new Shoe(2,"Sneaker","Nike Pegasus",109.99)); 
        cart.add(new Shoe(4, "Cleat", "Adidas Soccer Cleat", 100.00));
        
        return cart.toString();
    }




    @GetMapping("/checkouttotal")
    public String calcTotal(){
    //This will return the total price of the cart 
        
    //Need to Get Cart items from cartDB and add them to local array list
        String items = CheckOut();

        ArrayList<Shoe> cart = new ArrayList<Shoe>();
        cart.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
        cart.add(new Shoe(2,"Sneaker","Nike Pegasus",109.99)); 
        cart.add(new Shoe(4, "Cleat", "Adidas Soccer Cleat", 100.00));

        Double total = 0.0;
        for (int i = 0; i < cart.size(); i++){
            Shoe item = cart.get(i);
            Double item_price = item.getPrice();
            total = total + item_price;
        }
        
        //Call to Update Inventory 
    return items + total.toString();

}



 }
