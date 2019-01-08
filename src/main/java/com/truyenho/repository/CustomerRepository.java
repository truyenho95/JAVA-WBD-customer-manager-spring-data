package com.truyenho.repository;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
  Iterable<Customer> findAllByProvince(Province province);
  Page<Customer> findAllByFirstNameContaining(String firstname, Pageable pageable);
}
