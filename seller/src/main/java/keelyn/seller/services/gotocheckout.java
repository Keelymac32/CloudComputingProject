package keelyn.seller.services;


import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import keelyn.seller.entities.*;

public class gotocheckout {
    
    public Double gettingTotal(List<Shoe> shoeList) {
        //urls for get and post commands on checkout microservice 
        String postUrl = "http://localhost:8080/checkout/addcart";
        String getUrl = "http://localhost:8080/checkout/total";
        
        
        RestTemplate restTemplate = new RestTemplate();
       
        //I think this is passing list of shoes to the POST function in checkout microservice
        restTemplate.postForObject(postUrl, shoeList, null);
        
        //Getting total calculated in GET function of checkout microservice
        Double total = restTemplate.getForObject(getUrl, Double.class);
        return total;
    }

}
