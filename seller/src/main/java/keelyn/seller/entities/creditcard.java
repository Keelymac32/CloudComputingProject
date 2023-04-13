package keelyn.seller.entities;
 
import java.util.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
 
@Entity
@Table(name = "creditcard")
public class creditcard {
  
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String date;
    private Integer CSV;


    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }


    public Integer getCSV() {
        return this.CSV;
    }

    public void setCSV(Integer CSV) {
        this.CSV = CSV;
    }

//    public Object getId;
 
 
    public creditcard(Integer id, Integer CSV, String name, String date){
        this.name = name;
        this. date = date;
        this.id = id;
        this.CSV = CSV;
    }
 

    public creditcard(String date, String name) {
        this(null, 111, name, date);
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
        return Objects.hash(name);
    }
 
    @Override
    public String toString() {
        return "Card{" +
                " Name = " + name +
                ", Date = " + date +
                ", Card Number = '" + id + 
                ", CSV = $" + CSV +
                '}';
    }
 
}
 