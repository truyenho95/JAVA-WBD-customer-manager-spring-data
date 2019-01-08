package com.truyenho.service.impl;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;
import com.truyenho.repository.CustomerRepository;
import com.truyenho.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;

public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {
  }

  @Override
  public Iterable<Customer> findAll() {
    return customerRepository.findAll();
  }

  @Override
  public Iterable<Customer> findAllByProvince(Province province) {
    return customerRepository.findAllByProvince(province);
  }

  @Override
  public Customer findById(Long id) {
    return customerRepository.findOne(id);
  }

  @Override
  public void save(Customer customer) {
    customerRepository.save(customer);
  }

  @Override
  public void remove(Long id) {
    customerRepository.delete(id);
  }
}
