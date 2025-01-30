package org.example.claiminsured.api;


import org.example.claiminsured.dto.Warrenty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/claims")
public class ClaimAPI {

    @Autowired
    private RestTemplate restTemplate;


    @GetMapping("/get")
    public String getDuration(){

        String str = restTemplate.getForObject("http://localhost:8082/warrentyapi/byId/1", String.class);
        return str;
    }

    @GetMapping("/getById")
    public String getCustomerById(){
        String str1 = restTemplate.getForObject("http://localhost:8080/api/byId?id=1", String.class);
        return str1;
    }
}
