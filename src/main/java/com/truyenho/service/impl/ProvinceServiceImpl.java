package com.truyenho.service.impl;

import com.truyenho.model.Province;
import com.truyenho.repository.ProvinceRepository;
import com.truyenho.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;

public class ProvinceServiceImpl implements ProvinceService {

  @Autowired
  private ProvinceRepository provinceRepository;

  @Override
  public Iterable<Province> findAll() {
    return provinceRepository.findAll();
  }

  @Override
  public Province findById(Long id) {
    return provinceRepository.findOne(id);
  }

  @Override
  public void save(Province province) {
    provinceRepository.save(province);
  }

  @Override
  public void remove(Long id) {
    provinceRepository.delete(id);
  }
}
