package com.example.inventory_management.service;

import com.example.inventory_management.model.Product;
import com.example.inventory_management.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product save(Product p) { return repository.save(p); }
    public List<Product> getAll() { return repository.findAll(); }
    public Product getById(Long id) { return repository.findById(id).orElseThrow(); }
    public Product update(Long id, Product details) {
        Product existing = getById(id);
        existing.setName(details.getName());
        existing.setDescription(details.getDescription());
        existing.setSku(details.getSku());
        existing.setPrice(details.getPrice());
        existing.setQuantity(details.getQuantity());
        existing.setStatus(details.getStatus());
        return repository.save(existing);
    }
    public void delete(Long id) { repository.deleteById(id); }
}