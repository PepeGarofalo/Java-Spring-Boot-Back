package com.api.crud.product;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        2323L,          // id
                        "Mac Book PRO",            // name
                        233,             // price
                        LocalDate.of(2025, Month.MARCH, 5), // releaseDate
                        2                // antiguedad
                )
        );
    }
}
