package keelyn.shoestore.entities;


import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shoe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    //private String url;
    private Integer id;
    private String type;
    private String name;
    private Double price;
    private Integer inventory;

    public Integer getInventory() {
        return this.inventory;
    }

    public void setInventory(Integer inventory) {
		this.inventory = inventory;}


    public Integer getId() {
    return this.id;
    }

    public void setId(Integer id) {
    this.id = id;
    };

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shoe(){
        this.type = "None";
        this.name = "No Name";
        this.price = 0.00;
        this.inventory = 0;
    }

    public Shoe(Integer id, String type, String name, Double price, Integer inventoryInteger) {
        //this.url = url;
        this.type = type;
        this.name = name;
        this.price = price;
        this.inventory = inventoryInteger;
    }

    @Override
public String toString() {
    return "Shoe{" +
            "id=" + id +
            "type=" + type +
            ", name='" + name + '\'' +
            ", price=" + price +
             ", inventory= " + inventory+
            '}';
}


    
}
