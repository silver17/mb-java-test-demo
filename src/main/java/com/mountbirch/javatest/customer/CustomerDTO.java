package com.mountbirch.javatest.customer;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;
import java.util.UUID;

@Getter
@Builder
public class CustomerDTO {

    private UUID uuid;
    private String name;
    private Integer age;
    private LocalDate birthDate;

}
