package keelyn.vendor;

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
import keelyn.vendor.entities.Shoe; 



@RestController
@RequestMapping(value = "/vendor" )
@SpringBootApplication
public class VendorRestController {
    
    public ArrayList<Shoe> inventory = new ArrayList<Shoe>();
     
        // Initialize an ArrayList with add()

@Autowired
   //hard coded shoes that will be pulled instead form check out 
    

    @GetMapping()
    public String getinventory(){
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
    public String deleteShoeInventory(@Valid @RequestBody Shoe shoe){
        inventory.remove(shoe);
        return inventory.toString();
    }

    @PutMapping()
    public String updateShoeInventory(@Valid @RequestBody Shoe updatedShoe){
        

        return "Not Configured";
    }



 }
