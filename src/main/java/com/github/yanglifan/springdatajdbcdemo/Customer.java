package com.github.yanglifan.springdatajdbcdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table(Tables.CUSTOMER)
public class Customer {
    @Id
    Long id;
    String name;
    LocalDate dob;
}
