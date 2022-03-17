package net.javaguildes.springboot.Database;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import net.javaguildes.springboot.Repositories.AccountRepository;

@Configuration
public class Db {
    //private static final Logger logger=LoggerFactory.getLogger(Db.class);
    @Bean
    CommandLineRunner initDB(AccountRepository AccountRepository){
        
        return new CommandLineRunner() {

            @Override
            public void run(String... args) throws Exception {
                // User u1=new User("dvhl", "123");
                // User u2=new User("admin", "admin123");
                // System.out.print("add test data:" +userRepository.save(u1));
                // System.out.print("add test data:" +userRepository.save(u2));
            }
            
        };
        
    }
}