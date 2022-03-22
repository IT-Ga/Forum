package net.javaguildes.springboot.JWT;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import net.javaguildes.springboot.Model.Account;
import net.javaguildes.springboot.Repositories.JwtRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	  @Autowired
	    JwtRepo jwtRepo;
	    @Override
	    public UserDetailsImpl  loadUserByUsername(String username) throws UsernameNotFoundException { //lay thong tin user khi nhan token
	        Account user = jwtRepo.findByUsername(username);
	        if(user==null){
	            throw new UsernameNotFoundException(username);
	        } else {
	            return new UserDetailsImpl((Account)user);
	        }
	        
	    }
}