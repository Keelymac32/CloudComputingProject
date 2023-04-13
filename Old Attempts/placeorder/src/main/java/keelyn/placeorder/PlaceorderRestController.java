package keelyn.placeorder;

import keelyn.placeorder.entities.Shoe;
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
public class PlaceorderRestController {
    

    
    
@Autowired
   //hard coded shoes that will be pulled instead form check out 
    
    
/* 
    //This should add shoe objects to the cart repository depending on the shoe type number they input
    @GetMapping("/placeorder")
    public String PlaceOrder(@RequestParam(value = "shoeNum", defaultValue = "1") int shoeNum){
    //Call to the inventory database to get the list of the shoes in ventory depending on id
        ArrayList<Shoe> inventory = new ArrayList<Shoe>();
        ArrayList<Shoe> cart = new ArrayList<Shoe>();

        inventory.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
        inventory.add(new Shoe(2,"Sneaker","Nike Fly Ease",109.99));
        inventory.add(new Shoe(3,"Sneaker","Nike Zoom Fly",109.99));
        inventory.add(new Shoe(4,"Cleat","Puma Soccer Cleat",99.99));
        inventory.add(new Shoe(5, "Cleat", "Adidas Soccer Cleat", 100.00));
        inventory.add(new Shoe(6, "Cleat", "Nike Mericural Cleat", 100.00));
    
    // Checking to make sure input is appropriate 
        if ((shoeNum > 6) || (shoeNum < 1)){
            return "Input Invalid";
        }

    //The shoeNUM will correspond to the id and will add the shoe with the id will be addded to the cart 
        Shoe ShoeInput = inventory.get(shoeNum);
        cart.add(ShoeInput);

        return cart.toString();
    }
*/
    @GetMapping("/placeorder")
	public static String placeorder(@RequestParam(value = "shoenum", defaultValue = "1") int x) {

            ArrayList<Shoe> inventory = new ArrayList<Shoe>();
            ArrayList<Shoe> cart = new ArrayList<Shoe>();
            inventory.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
            inventory.add(new Shoe(2,"Sneaker","Nike Fly Ease",109.99));
            inventory.add(new Shoe(3,"Sneaker","Nike Zoom Fly",109.99));
            inventory.add(new Shoe(4,"Cleat","Puma Soccer Cleat",99.99));
            inventory.add(new Shoe(5, "Cleat", "Adidas Soccer Cleat", 100.00));
            inventory.add(new Shoe(6, "Cleat", "Nike Mericural Cleat", 100.00));

            if ((x > 6) || (x < 1)){
                return "Input Invalid";
            }

            Shoe ShoeInput = inventory.get(x);
            cart.add(ShoeInput); // this call will utilize cart and updating microservice   

			return cart.toString();
		}



 }
