package com.mountbirch.javatest.customer;

import java.util.UUID;

public class CustomerNotFoundException extends CustomerException {

    public CustomerNotFoundException(UUID uuid) {
        super("Not found", uuid);
    }

}
