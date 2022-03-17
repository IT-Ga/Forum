package net.javaguildes.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguildes.springboot.Model.Role;
import net.javaguildes.springboot.Repositories.RoleRepository;
import net.javaguildes.springboot.Service.RoleService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(path = "/roles")
public class RoleController {
	
	@Autowired
	RoleService roleSV;
	@GetMapping("")
	public List<Role> getAllRoles(){
        return roleSV.getAllRoles();
}
	
	
	
}
