package net.javaguildes.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
