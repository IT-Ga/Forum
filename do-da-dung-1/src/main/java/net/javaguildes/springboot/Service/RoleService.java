package net.javaguildes.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguildes.springboot.Model.Role;
import net.javaguildes.springboot.Repositories.RoleRepository;

@Service
public class RoleService {
   @Autowired
   RoleRepository rolerepo;
   public List<Role> getAllRoles(){
	   return rolerepo.findAll();
   }
   
   
}
