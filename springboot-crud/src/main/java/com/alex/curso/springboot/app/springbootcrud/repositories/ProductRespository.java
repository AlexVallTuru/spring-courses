package com.alex.curso.springboot.app.springbootcrud.repositories;

import org.springframework.data.repository.CrudRepository;

import com.alex.curso.springboot.app.springbootcrud.entities.Product;

public interface ProductRespository extends CrudRepository<Product, Long>{
    boolean existsBySku(String sku);
}
