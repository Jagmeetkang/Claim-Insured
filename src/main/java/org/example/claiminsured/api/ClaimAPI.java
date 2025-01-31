package org.example.claiminsured.api;


import org.example.claiminsured.clients.WarrentyClient;
import org.example.claiminsured.dto.Warrenty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.time.Duration;
import java.util.List;

@RestController
@RequestMapping("/claims")
public class ClaimAPI {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private WebClient webClient;

    @Autowired
    private WarrentyClient warrentyClient;


    @GetMapping("/get")
    public Warrenty getDuration(){

        //String str = restTemplate.getForObject("http://localhost:8082/warrentyapi/byId/1", String.class);


//        String warrenty = webClient.get().uri("http://localhost:8082/warrentyapi/byId/1")
//                .header("token", "7687g78yg88g9u")
//                .header("username", "adminuser")
//                .header("password" ,"pragra123")
//                .retrieve()
//                .bodyToMono(String.class)
//                .timeout(Duration.ofMillis(10000))
//                .block();
//
//        return warrenty;

        //Feign client implememntation
        Warrenty warrenty = warrentyClient.getWarrenty((1));
        return warrenty;



    }

    @GetMapping("/getById")
    public String getCustomerById(){
        String str1 = restTemplate.getForObject("http://localhost:8080/api/byId?id=1", String.class);
        return str1;
    }
}
