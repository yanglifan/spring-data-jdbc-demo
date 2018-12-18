package com.github.yanglifan.springdatajdbcdemo;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;

@Table("t_customers")
public class Customer {
    @Id
    Long id;
    String name;
    LocalDate dob;
}
