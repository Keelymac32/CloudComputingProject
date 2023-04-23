package keelyn.seller.services;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import keelyn.seller.entities.*;

import java.util.*;



public class goToInventory {
    public String gettingInventory() {
        String getUrl = "http://localhost:8082/vendor";
        
        RestTemplate restTemplate = new RestTemplate();
        
        //Getting total calculated in GET function of checkout microservice
        String inventory = restTemplate.getForObject(getUrl,String.class );
        return inventory;
    }
}

//String inventory = restTemplate.getForObject(getUrl,Shoe[].class );
//return List.of(inventory);