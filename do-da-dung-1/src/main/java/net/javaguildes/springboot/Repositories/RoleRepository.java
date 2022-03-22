package net.javaguildes.springboot.Repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguildes.springboot.Model.Role;

public interface RoleRepository extends JpaRepository<Role,Long>{
	 Role findByRolename(String rolename);
}
