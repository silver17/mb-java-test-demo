package com.mountbirch.javatest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepository repository;

    public List<Customer> getAll() {
        return repository.findAll();
    }

    public Customer updateName(UUID uuid, String name) {
        Customer customer = repository.findByUuid(uuid)
                .orElseThrow(() -> new CustomerNotFoundException(uuid));

        if (name == null || name.isBlank()) {
            throw new CustomerDataException("Name null or blank", uuid);
        }

        customer.setName(name);
        return repository.save(customer);
    }

    /**
     * This method can be ignored, just to create dummy data
     */
    @PostConstruct
    void createCustomers() {
        LocalDate now = LocalDate.now();
        Customer toomas = Customer.builder()
                .age(45)
                .name("Toomas")
                .birth(now.minusYears(45))
                .uuid(UUID.fromString("81036263-3c84-4e42-8c5d-e0d952ff6038"))
                .build();

        Customer luisa = Customer.builder()
                .age(25)
                .name("Luisa")
                .birth(now.minusYears(25).minusDays(1).minusMonths(3))
                .uuid(UUID.fromString("39604fd9-1f24-4831-996a-4fb52b0bef6d"))
                .build();

        repository.saveAll(Arrays.asList(toomas, luisa));
    }

}
