package com.OnlineShop.Application.demo.repository;

import com.OnlineShop.Application.demo.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products,Integer> {
}
