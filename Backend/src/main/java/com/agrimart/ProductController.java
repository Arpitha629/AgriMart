package com.agrimart;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
@CrossOrigin(origins = "*")
public class ProductController {

    private final List<Product> products = List.of(
        new Product(101L, "Tomatoes", "Vegetables", 40, 50, "kg",
                "Fresh tomatoes", "Karnataka", "Available"),

        new Product(102L, "Potatoes", "Vegetables", 30, 100, "kg",
                "Fresh potatoes", "Karnataka", "Available"),

        new Product(103L, "Onions", "Vegetables", 35, 80, "kg",
                "Fresh onions", "Karnataka", "Available"),

        new Product(104L, "Carrots", "Vegetables", 50, 40, "kg",
                "Fresh carrots", "Karnataka", "Available"),

        new Product(107L, "Maize", "Grains", 45, 60, "kg",
                "Quality maize", "Karnataka", "Available")
    );

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        return products.stream()
                .filter(p -> p.getProductId().equals(id))
                .findFirst()
                .orElse(null);
    }
}