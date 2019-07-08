package com.eksad.latihanspringmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.eksad.latihanspringmvc.model.Brand;

public interface BrandRepositoryDAO extends JpaRepository<Brand, Long>{

}
