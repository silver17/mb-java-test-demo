package com.mountbirch.javatest.customer;

public class CustomerDTO {

    private Long id;
    private String name;
    private Integer birthYear;
    private String birthMonth;
    private Integer birthDay;

    public Long getId() {
        return id;
    }

    public CustomerDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public CustomerDTO setName(String name) {
        this.name = name;
        return this;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public CustomerDTO setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
        return this;
    }

    public String getBirthMonth() {
        return birthMonth;
    }

    public CustomerDTO setBirthMonth(String birthMonth) {
        this.birthMonth = birthMonth;
        return this;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public CustomerDTO setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
        return this;
    }
}
