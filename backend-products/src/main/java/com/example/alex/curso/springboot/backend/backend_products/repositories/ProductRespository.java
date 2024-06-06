package com.example.alex.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.alex.curso.springboot.backend.backend_products.entities.product;

@RepositoryRestResource(path = "products")
public interface ProductRespository extends CrudRepository<product, Long>{

}
