package com.mountbirch.javatest.customer;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerMapper mapper;
    private final CustomerService service;

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAll() {
        return ResponseEntity.ok(service.getAll().stream()
                .map(mapper::fromEntity)
                .collect(Collectors.toList()));
    }

    @PatchMapping("/{uuid}")
    public ResponseEntity<CustomerDTO> updateName(@PathVariable UUID uuid, @RequestParam String name) {
        return ResponseEntity.ok(mapper.fromEntity(service.updateName(uuid, name)));
    }

}
