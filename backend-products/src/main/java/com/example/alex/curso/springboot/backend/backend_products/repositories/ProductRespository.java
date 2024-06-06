package com.example.alex.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.alex.curso.springboot.backend.backend_products.entities.product;

public interface ProductRespository extends CrudRepository<product, Long>{

}
