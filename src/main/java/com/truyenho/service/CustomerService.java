package com.truyenho.service;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;

public interface CustomerService {
  Iterable<Customer> findAll();

  Iterable<Customer> findAllByProvince(Province province);

  Customer findById(Long id);

  void save(Customer customer);

  void remove(Long id);
}
