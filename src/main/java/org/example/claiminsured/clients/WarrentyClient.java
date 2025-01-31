package org.example.claiminsured.clients;


import org.example.claiminsured.dto.Warrenty;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "warrentyClient", url = "http://localhost:8082/warrentyapi")
public interface WarrentyClient {

    @GetMapping("/byId/{id}")
    Warrenty getWarrenty(@PathVariable Integer id );






}
