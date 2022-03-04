package uz.oyatjon.security_rest.dto;

import lombok.Getter;
import lombok.Setter;

/**
 * @author johnl
 * @since 2/24/2022
 */

@Getter
@Setter
public class AddRoleToUserDTO {
    private String username;
    private String roleCode;
}
