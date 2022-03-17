package net.javaguildes.springboot.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Bill;

public interface BillRepository extends JpaRepository<Bill,Long> {

}
