package com.example.inventory_management.controller;

import com.example.inventory_management.dto.ApiResponse;
import com.example.inventory_management.model.Product;
import com.example.inventory_management.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService service;

    @PostMapping("/")
    public ResponseEntity<ApiResponse<Product>> create(@Valid @RequestBody Product p) {
        return ResponseEntity.ok(new ApiResponse<>(true, "Created Successfully", service.save(p)));
    }

    @GetMapping("/")
    public ResponseEntity<ApiResponse<List<Product>>> getAll() {
        return ResponseEntity.ok(new ApiResponse<>(true, "Fetched All", service.getAll()));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> getById(@PathVariable Long id) {
        return ResponseEntity.ok(new ApiResponse<>(true, "Found", service.getById(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<Product>> update(@PathVariable Long id, @Valid @RequestBody Product p) {
        return ResponseEntity.ok(new ApiResponse<>(true, "Updated", service.update(id, p)));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<Void>> delete(@PathVariable Long id) {
        service.delete(id);
        return ResponseEntity.ok(new ApiResponse<>(true, "Deleted Successfully", null));
    }
}