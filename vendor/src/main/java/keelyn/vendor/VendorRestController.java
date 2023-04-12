package keelyn.vendor;

import keelyn.vendor.entities.Shoe;
import org.springframework.http.MediaType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import jakarta.validation.Valid;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.*;;





@RestController
@RequestMapping(value = "/vendor" )
@SpringBootApplication
public class VendorRestController {
    

    

@Autowired
   //hard coded shoes that will be pulled instead form check out 
    
    
   

    @GetMapping()
    public String getinventory(){

//Call to the inventory database will return items in the inventory 
    ArrayList<Shoe> inventory = new ArrayList<Shoe>();
        inventory.add(new Shoe(1,"Sneaker","Nike Pegasus",99.99));
        inventory.add(new Shoe(2,"Sneaker","Nike Pegasus",109.99)); 
        inventory.add(new Shoe(4, "Cleat", "Adidas Soccer Cleat", 100.00));
        
        return inventory.toString();
    }



// Method that adds a shoe to the inventory 
    @PostMapping()
    public Shoe addShoeInventory(@Valid @RequestBody Shoe shoe){
    

    return shoe;

}





    @DeleteMapping("/deleteshoeinventory")
    public String deleteShoeInventory(@Valid @RequestBody Shoe shoe){

    
    
    
    return "Deleting Shoe";
    }

    @PutMapping("/updateshoeinventory")
    public String updateShoeInventory(@Valid @RequestBody Shoe shoe){



        return "Updating shoe";
    }



 }
