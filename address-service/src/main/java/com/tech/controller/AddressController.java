package com.tech.controller;

import com.tech.model.Address;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
public class AddressController{
    @GetMapping
    public Address getAddress(){
        Address address = new Address();
        address.setName("CTC");
        return address;
    }
}
