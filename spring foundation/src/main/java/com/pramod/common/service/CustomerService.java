package com.pramod.common.service;

import com.pramod.common.aspects.Loggable;
import com.pramod.common.data.entity.Customer;
import com.pramod.common.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Loggable
    public List<Customer> getAll(){
        return (List<Customer>) this.customerRepository.findAll();
    }

    @Loggable
    public Optional<Customer> findOne(String id){
        return this.customerRepository.findById(id);
    }
}
