package com.truyenho.service.impl;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;
import com.truyenho.repository.CustomerRepository;
import com.truyenho.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public class CustomerServiceImpl implements CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public CustomerServiceImpl() {
  }

  @Override
  public Iterable<Customer> findAllByProvince(Province province) {
    return customerRepository.findAllByProvince(province);
  }

  @Override
  public Page<Customer> findAll(Pageable pageable) {
    return customerRepository.findAll(pageable);
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

  @Override
  public Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable) {
    return customerRepository.findAllByFirstNameContaining(firstname, pageable);
  }
}
