package com.tech.controller;

import com.tech.entity.Address;
import com.tech.service.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/address")
@RequiredArgsConstructor
public class AddressController {
    private final AddressService addressService;

    @PostMapping
    public Address setAddressService(@RequestBody Address address) {
        return addressService.addAddress(address);
    }

    @PostMapping("/get")
    public Address getAddressById(@RequestBody Long id) {
        return addressService.getAddressById(id);
    }

    @PostMapping("/update")
    public Address updateAddress(@RequestBody Address address) {
        return addressService.updateAddress(address);
    }

    @PostMapping("/delete")
    public void deleteAddress(@RequestBody Long id) {
        addressService.deleteAddress(id);
    }

}
