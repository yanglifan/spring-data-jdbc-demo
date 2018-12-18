package com.github.yanglifan.springdatajdbcdemo;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
    @Query("select * from t_customers c where c.name = :name")
    Customer findByName(@Param("name") String name);
}
