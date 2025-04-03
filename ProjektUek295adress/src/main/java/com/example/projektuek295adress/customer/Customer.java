package com.example.projektuek295adress.customer;

import com.example.projektuek295adress.adress.Address;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Data
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customer_id;

    private String name;
    private String phone;
    private String birthday;

    @ManyToOne
    @JoinColumn(name = "id_address", referencedColumnName = "address_id")
    private Address address;
}
