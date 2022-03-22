package net.javaguildes.springboot.Service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import net.javaguildes.springboot.JWT.JwtResponse;
import net.javaguildes.springboot.JWT.JwtUtils;
import net.javaguildes.springboot.JWT.LoginRequest;
import net.javaguildes.springboot.JWT.UserDetailsImpl;
import net.javaguildes.springboot.Model.Account;
import net.javaguildes.springboot.Model.Response;
import net.javaguildes.springboot.Model.Role;
import net.javaguildes.springboot.Repositories.AccountRepository;
import net.javaguildes.springboot.Repositories.RoleRepository;
@Service
public class AccountService {
    @Autowired
    TimeService timeService;
    @Autowired
    AuthenticationManager authenticationManager;
    @Autowired
    AccountRepository accountRepo;
    @Autowired
    RoleRepository roleRepo;
    @Autowired
    JwtUtils jwtUtils;
    @Autowired
    PasswordEncoder passwordEncoder;
    public List<Role> getRole(){
        return roleRepo.findAll();
    }
    public Page<Account> getAllAccounts(int page){
        return accountRepo.findAll(PageRequest.of(page-1, 5));
    }
    public ResponseEntity<Response> registerAccount(Account newAcc){
        Optional<Account> foundAcc= accountRepo.findByUsername(newAcc.getUsername());
        if(foundAcc.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(new Response("Fail","ten dang nhap da ton tai",""));
        } else {
            foundAcc=accountRepo.findByEmail(newAcc.getEmail());
            if(foundAcc.isPresent()){
                return ResponseEntity.status(HttpStatus.OK).body(new Response("Fail","Email da ton tai",""));
            } else {
                Role newRole=roleRepo.findByRolename("user");
                newAcc.setRole_id(newRole);;
                newAcc.setPassword(passwordEncoder.encode(newAcc.getPassword()));
                newAcc.setCreated_at(timeService.getCurrentTimestamp());
                return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da Dang ky thanh cong",accountRepo.save(newAcc)));
            } 
        }
    }
    public ResponseEntity<Response> changeAccountInfo(Account updatedAcc,long id){
        accountRepo.findById(id).map(acc ->{
            if(updatedAcc.getName()!=null)
            acc.setName(updatedAcc.getName());
            if(updatedAcc.getBirthday()!=null)
            acc.setBirthday(updatedAcc.getBirthday());
            if(updatedAcc.getPhone()!=null)
            acc.setPhone(updatedAcc.getPhone());
            acc.setUpdated_at(timeService.getCurrentTimestamp());
            return accountRepo.save(acc);
        });
        return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da cap nhat",updatedAcc));
    }
    public ResponseEntity<Response> block(long id){
        accountRepo.findById(id).map(acc ->{
            if(acc.getIs_blocked()==false) 
                acc.setIs_blocked(true);
            else
                acc.setIs_blocked(false);
            return accountRepo.save(acc);
        });
        return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da cap nhat",""));
    }
    public ResponseEntity<Response> changeRole(long id,Role updatedRole) {
        accountRepo.findById(id).map(acc ->{
            acc.setRole_id(updatedRole);
            return accountRepo.save(acc);
        });
        return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da cap nhat",""));
    }
    public ResponseEntity<Response> changePass(long id,Account updatedAcc) {
        accountRepo.findById(id).map(acc ->{
            acc.setPassword(passwordEncoder.encode(updatedAcc.getPassword()));
            return accountRepo.save(acc);
        });
        return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da cap nhat",""));
    }
    public ResponseEntity<?> authenticateAccount(LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtUtils.generateJwtToken((UserDetailsImpl) authentication.getPrincipal());
        UserDetailsImpl accDetails = (UserDetailsImpl) authentication.getPrincipal();    
        return ResponseEntity.ok(new JwtResponse(jwt, accDetails)); 
    }
    public ResponseEntity<Response> getLogoutSuccess(){
        return ResponseEntity.status(HttpStatus.OK).body(new Response("OK","Da Dang Xuat",""));
    }
}
