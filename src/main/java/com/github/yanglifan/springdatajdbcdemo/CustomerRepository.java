package com.github.yanglifan.springdatajdbcdemo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findAllByProperty(String name);
}
