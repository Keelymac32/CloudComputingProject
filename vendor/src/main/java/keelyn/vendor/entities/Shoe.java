package keelyn.vendor.entities;
 
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "shoes")
public class Shoe {
 
    // private String url;
 
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String type;
    private String name;
    private Double price;
 
//    public Object getId;
 
 
    public Shoe() {
        this.type = "none";
        this.name = "no name";
        this.price = 0.00;
    }
 
    public Shoe(String type, String name) {
        // this.url = url;
        this(null, type, name, 0.0);
    }
 
    public Shoe(Integer id, String type, String name, Double price) {
        // this.url = url;
        this.id = id;
        this.type = type;
        this.name = name;
        this.price = price;
    }
   
    public Double getPrice() {
        return this.price;
    }
 
    public void setPrice(Double price) {
        this.price = price;
    }
 
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
 
 
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shoe shoe = (Shoe) o;
        return Objects.equals(id, shoe.id);
    }
 
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
 
    @Override
    public String toString() {
        return "Shoe { id: " + id + ", " + type + ", " + name + ", $" + price + "}" + "\n";
    }
 
}
 