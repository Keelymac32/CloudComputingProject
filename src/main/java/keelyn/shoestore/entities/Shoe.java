package keelyn.shoestore.entities;


import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


public class Shoe {


    private String url;
    private String type;
    private String name;
    private Double price;
    private Integer inventory = 0;

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

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

    public Integer getInventory() {
        return this.inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Shoe(String url, String type, String name, Double price) {
        this.url = url;
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public Shoe(String url, String type, String name, Double price, Integer inventory) {
        this.url = url;
        this.type = type;
        this.name = name;
        this.price = price;
        this.inventory = inventory;
    }



    
}
