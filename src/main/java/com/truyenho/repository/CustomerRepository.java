package com.truyenho.repository;

import com.truyenho.model.Customer;
import com.truyenho.model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<Customer, Long> {
  Iterable<Customer> findAllByProvince(Province province);
}
