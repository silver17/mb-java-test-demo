package com.mountbirch.javatest.customer;

import java.time.format.TextStyle;
import java.util.Locale;

public class CustomerMapper {

    private CustomerMapper() {}

    public static CustomerDTO fromEntity(Customer customer) {
        if (customer == null) {
            return null;
        }

        // TODO what can be improved in this method?
        return new CustomerDTO()
                .setId(customer.getId())
                .setName(customer.getName())
                .setBirthYear(customer.getBirthDate().getYear())
                .setBirthMonth(customer.getBirthDate().getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH))
                .setBirthDay(customer.getBirthDate().getDayOfMonth());
    }

}
