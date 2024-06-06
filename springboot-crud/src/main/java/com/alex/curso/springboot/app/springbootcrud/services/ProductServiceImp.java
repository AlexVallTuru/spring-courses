package com.alex.curso.springboot.app.springbootcrud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alex.curso.springboot.app.springbootcrud.entities.Product;
import com.alex.curso.springboot.app.springbootcrud.repositories.ProductRespository;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRespository respository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) respository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return respository.findById(id);
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return respository.save(product);
    }

    @Override
    @Transactional
    public Optional<Product> update(Long id, Product product) {
        Optional<Product> productOptional = respository.findById(id);

        if(productOptional.isPresent()){

            Product productDB = productOptional.orElseThrow();
            productDB.setName(product.getName());
            productDB.setPrice(product.getPrice());
            productDB.setDescription(product.getDescription());
            productDB.setSku(product.getSku());
            return Optional.of(respository.save(productDB));

        }
        return productOptional;
    }

    @Override
    @Transactional
    public Optional<Product> delete(Long id) {
        Optional<Product> productOptional = respository.findById(id);
        productOptional.ifPresent(productDB -> {
            respository.delete(productDB);
        });
        return productOptional;
    }

    @Override
    @Transactional(readOnly = true)
    public boolean existsBySku(String sku) {
        return respository.existsBySku(sku);
    }

}
