package uz.oyatjon.security_rest;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;
import uz.oyatjon.security_rest.domain.Role;
import uz.oyatjon.security_rest.domain.User;
import uz.oyatjon.security_rest.service.UserService;

import java.util.Arrays;
import java.util.List;
@SpringBootApplication
@RequiredArgsConstructor
public class SecurityRestApplication {
    private final PasswordEncoder passwordEncoder;
    private final UserService userService;



    public static void main(String[] args) {
        SpringApplication.run(SecurityRestApplication.class, args);
    }






//        @Bean
    CommandLineRunner run() {
        return args -> {

            Role admin = new Role(null, "ADMIN");
            Role manager = new Role(null, "MANAGER");
            Role employee = new Role(null, "EMPLOYEE");

            userService.saveRole(admin);
            userService.saveRole(manager);
            userService.saveRole(employee);


            userService.saveUser(new User(null, "admin", passwordEncoder.encode("admin123"), Arrays.asList(admin, manager)));
            userService.saveUser(new User(null, "manager", passwordEncoder.encode("manager123"), List.of(manager)));
            userService.saveUser(new User(null, "employee", passwordEncoder.encode("employee123"), List.of(employee)));
        };
    }










}
