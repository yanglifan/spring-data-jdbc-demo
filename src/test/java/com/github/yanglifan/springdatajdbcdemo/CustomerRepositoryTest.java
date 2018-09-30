package com.github.yanglifan.springdatajdbcdemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@Transactional
@ContextConfiguration(classes = SpringDataJdbcConfiguration.class)
public class CustomerRepositoryTest {

    @Autowired
    CustomerRepository customerRepository;

    @Test
    public void createSimpleCustomer() {

        Customer customer = new Customer();
        customer.dob = LocalDate.of(1904, 5, 14);
        customer.name = "Albert";

        Customer saved = customerRepository.save(customer);

        assertThat(saved.id).isNotNull();

        saved.name = "Hans Albert";

        customerRepository.save(saved);

        Optional<Customer> reloaded = customerRepository.findById(saved.id);

        assertThat(reloaded).isPresent();

        assertThat(reloaded.get().name).isEqualTo("Hans Albert");
    }
}
