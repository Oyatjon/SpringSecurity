package uz.oyatjon.security_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.oyatjon.security_rest.domain.User;


/**
 * @author johnl
 * @since 2/24/2022
 */
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
