package net.javaguildes.springboot.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "role")
public class Role {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

	private String rolename;
	
	public Role() {}
	
	public Role(String role_ame) {
		super();
		
		this.rolename = rolename;
	}
	
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRole_name() {
		return rolename;
	}
	public void setRole_name(String role_name) {
		this.rolename = role_name;
	}
	
	
}
