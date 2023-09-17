package com.example.ExceptionHandling.repositories;

import com.example.ExceptionHandling.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.sound.sampled.Port;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    // write native queries to get desired output....


}

