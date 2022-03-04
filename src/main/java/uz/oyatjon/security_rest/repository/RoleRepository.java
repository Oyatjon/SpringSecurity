package uz.oyatjon.security_rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.oyatjon.security_rest.domain.Role;


/**
 * @author johnl
 * @since 2/24/2022
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByCode(String roleCode);
}
