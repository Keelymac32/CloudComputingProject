package keelyn.seller.services;


import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import keelyn.seller.entities.*;

public class gotocheckout {
    
    public Double gettingTotal(List<Shoe> shoeList) {
        //urls for get and post commands on checkout microservice 
        
        String host = System.getenv("CHECKOUT_HOST");
        String port = System.getenv("CHECKOUT_PORT");

        String geturl = "http://" + host + ":" + port + "/checkout/total";
        
        String posturl = "http://" + host + ":" + port + "/checkout/addcart";
       




        RestTemplate restTemplate = new RestTemplate();
       
        //I think this is passing list of shoes to the POST function in checkout microservice
        String productCreateResponse = restTemplate.postForObject(posturl, shoeList, String.class);
        
        //Getting total calculated in GET function of checkout microservice
        Double total = restTemplate.getForObject(geturl, Double.class);

        return total;
    }

}
