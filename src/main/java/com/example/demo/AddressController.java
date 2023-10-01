package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addresses")
public class AddressController {
    @Autowired
    private AddressRepository addressRepository;

    @PostMapping
    public Address createAddress(@RequestBody  Address address) {
        return addressRepository.save(address);
    }

    @GetMapping("/{addressId}")
    public Address getAddress(@PathVariable Integer addressId) {
        return addressRepository.findById(addressId).orElse(null);
    }
}
