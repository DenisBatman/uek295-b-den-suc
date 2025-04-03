package com.example.projektuek295adress.adress;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AddressRepository extends JpaRepository<Address, UUID> {

    @Query("select a from Address a where a.city = ?1 order by a.city")
    List<Address> findByCityOrderByCityAsc(String city);
}
