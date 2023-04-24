package keelyn.seller.services;


import java.util.*;

import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import keelyn.seller.entities.*;

public class gotocheckout {
    
    public Double gettingTotal(List<Shoe> shoeList) {
        //urls for get and post commands on checkout microservice 
        
        String hosturl = System.getProperty("hosturl","localhost");
        String porturl = System.getProperty("porturl","8081");

        String geturl = "http://" + hosturl + ":" + porturl + "/checkout/total";
        
        String posturl = "http://" + hosturl + ":" + porturl + "/checkout/addcart";
       




        RestTemplate restTemplate = new RestTemplate();
       
        //I think this is passing list of shoes to the POST function in checkout microservice
        restTemplate.postForObject(posturl, shoeList, null) ;
        
        //Getting total calculated in GET function of checkout microservice
        Double total = restTemplate.getForObject(geturl, Double.class);
        
        return total;
    }

}
