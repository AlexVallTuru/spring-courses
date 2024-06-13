package com.example.alex.curso.springboot.backend.backend_products.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.alex.curso.springboot.backend.backend_products.entities.product;

@CrossOrigin(origins = {"http://localhost:5173"})
@RepositoryRestResource(path = "products")
public interface ProductRespository extends CrudRepository<product, Long>{

}
