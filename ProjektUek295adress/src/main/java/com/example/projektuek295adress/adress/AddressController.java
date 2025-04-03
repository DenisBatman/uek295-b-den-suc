package com.example.projektuek295adress.adress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping
public class AddressController {

    private final AddressService addressService;

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("GetAllAddresses/")
    public List<Address> getAll() {
        return addressService.getAllAddresses();
    }

    @GetMapping("sortByCity/")
    public List<Address> getAllSortByCity(String city) {
        return addressService.getAllAddressesSortByCity(city);
    }

    @GetMapping("GetAddressById/{id}")
    public Address getById(@PathVariable UUID id) {
        return addressService.getAddress(id).orElse(null);
    }

    @PostMapping("CreateAddress/")
    public ResponseEntity<Address> create(@RequestBody Address address) {
        Address created = addressService.createAddress(address);
        return ResponseEntity.ok(created);
    }

    @PutMapping("EditAddress/{id}")
    public Address update(@PathVariable UUID id, @RequestBody Address address) {
        return addressService.updateAddress(id, address);
    }

    @DeleteMapping("DeleteAddress/{id}")
    public void delete(@PathVariable UUID id) {
        addressService.deleteAddress(id);
    }
}
