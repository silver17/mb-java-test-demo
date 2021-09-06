package com.mountbirch.javatest.customer;

import java.util.UUID;

public class CustomerDataException extends CustomerException {

    public CustomerDataException(String msg, UUID uuid) {
        super(msg, uuid);
    }

}
