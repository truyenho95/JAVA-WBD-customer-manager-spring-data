package com.truyenho.service;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
//  Iterable<Customer> findAll();

  Iterable<Customer> findAllByProvince(Province province);

  Page<Customer> findAll(Pageable pageable);

  Customer findById(Long id);

  void save(Customer customer);

  void remove(Long id);

  Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
