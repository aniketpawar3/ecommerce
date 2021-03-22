package com.zensar;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zensar.Products;

@Repository
public interface ProductsRepository extends JpaRepository<Products,Integer> {

}
