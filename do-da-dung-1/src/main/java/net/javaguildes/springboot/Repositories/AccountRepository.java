package net.javaguildes.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Account;

public interface AccountRepository extends JpaRepository<Account,Long>{

}
