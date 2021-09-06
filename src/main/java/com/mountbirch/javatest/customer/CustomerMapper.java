package com.mountbirch.javatest.customer;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mapping(source = "birth", target = "birthDate")
    CustomerDTO fromEntity(Customer customer);

}
