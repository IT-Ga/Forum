package net.javaguildes.springboot.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Type_product;


public interface Type_productRepository extends JpaRepository<Type_product,Long>{
	Optional<Type_product> findByTypename(String typename);
   
    
}
