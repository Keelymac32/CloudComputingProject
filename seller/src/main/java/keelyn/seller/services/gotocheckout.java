package keelyn.seller.services;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

public class gotocheckout {
    
    public Double gettingTotal() {
        String url = "http://world-pop/countries";
        RestTemplate restTemplate = new RestTemplate();
        //Country[] countries = restTemplate.getForObject(url, Country[].class);

        return 0.0;
    }

}
