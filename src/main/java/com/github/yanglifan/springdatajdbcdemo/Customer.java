package com.github.yanglifan.springdatajdbcdemo;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

public class Customer {
    @Id
    Long id;
    String name;
    LocalDate dob;
}
