package net.javaguildes.springboot.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{
	Optional<Account> findByUsername(String username);
    Boolean existsByUsername(String username);
    Boolean existsByEmail(String email);
    Optional<Account> findByEmail(String email);
    Account findByUsernameAndPassword(String username,String password);
}