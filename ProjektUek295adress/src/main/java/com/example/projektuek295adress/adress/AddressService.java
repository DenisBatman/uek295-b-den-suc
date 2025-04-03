package com.example.projektuek295adress.adress;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public List<Address> getAllAddresses() {
        return addressRepository.findAll();
    }

    public Optional<Address> getAddress(UUID id) {
        return addressRepository.findById(id);
    }

    @PostMapping("/table")
    public Address createAddress(Address address) {
        return addressRepository.save(address);
    }

    public Address updateAddress(UUID id, Address newAddress) {
        return addressRepository.findById(id)
                .map(existing -> {
                    existing.setCity(newAddress.getCity());
                    existing.setStreet(newAddress.getStreet());
                    existing.setCountry(newAddress.getCountry());
                    return addressRepository.save(existing);
                })
                .orElse(null);
    }

    public void deleteAddress(UUID id) {
        addressRepository.deleteById(id);
    }
}
