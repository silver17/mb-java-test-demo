package com.mountbirch.javatest.customer;

import java.util.UUID;

public class CustomerException extends RuntimeException {

    private final UUID uuid;

    public CustomerException(String msg, UUID uuid) {
        super(String.format("Customer with uuid %s not found", uuid));
        this.uuid = uuid;
    }

    public UUID getUuid() {
        return this.uuid;
    }

}
