package keelyn.vendor;

import keelyn.vendor.entities.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;;





@RestController
@RequestMapping(value = "/vendor" )
@SpringBootApplication
public class VendorRestController {
    
    public ArrayList<Shoe> inventory = new ArrayList<Shoe>();
    

    ArrayList<String> gfg = new ArrayList<String>();
 
        // Initialize an ArrayList with add()

@Autowired
   //hard coded shoes that will be pulled instead form check out 
    

    @GetMapping()
    public String getinventory(){
        inventory.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
        inventory.add(new Shoe(2,"Sneaker","Nike Pegasus",109.99)); 
        inventory.add(new Shoe(4, "Cleat", "Adidas Soccer Cleat", 100.00));


        //Call to the inventory database will return items in the inventory 
    
        
        
        return inventory.toString();
    }



// Method that adds a shoe to the inventory 
    @PostMapping()
    public Shoe addShoeInventory(@Valid @RequestBody Shoe shoe){
        inventory.add(shoe);
    return shoe;

}





    @DeleteMapping()
    public Boolean deleteShoeInventory(@Valid @RequestBody Shoe shoe){
    return  inventory.remove(shoe);
    }

    @PutMapping()
    public Shoe updateShoeInventory(@Valid @RequestBody Shoe shoe){
        
        return shoe;
    }



 }
