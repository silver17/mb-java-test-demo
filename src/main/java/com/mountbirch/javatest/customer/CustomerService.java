package com.mountbirch.javatest.customer;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository repository;

    public CustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    public List<Customer> getAll() {
        return repository.findAll();
    }

    /**
     * This method can be ignored, just to create dummy data
     */
    @PostConstruct
    void createCustomers() {
        LocalDate now = LocalDate.now();
        Customer toomas = new Customer()
                .setName("Toomas")
                .setBirthDate(now.minusYears(45));

        Customer luisa = new Customer()
                .setName("Luisa")
                .setBirthDate(now.minusYears(25).minusDays(1).minusMonths(3));

        repository.saveAll(Arrays.asList(toomas, luisa));
    }

}
