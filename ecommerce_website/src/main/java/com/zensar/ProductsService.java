package com.zensar;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.Products;
import com.zensar.ProductsRepository;

@Service
public class ProductsService {

 @Autowired
private ProductsRepository repository;

 public List<Products> getProducts() {
return repository.findAll();
}
}