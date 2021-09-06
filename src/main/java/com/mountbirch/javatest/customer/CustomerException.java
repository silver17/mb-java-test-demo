package com.mountbirch.javatest.customer;

import lombok.Getter;

import java.util.UUID;

@Getter
public class CustomerException extends RuntimeException {

    private UUID uuid;

    public CustomerException(String msg, UUID uuid) {
        super(msg);
        this.uuid = uuid;
    }

}
