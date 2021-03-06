package uz.oyatjon.security_rest.exception;


import uz.oyatjon.security_rest.resource.HttpStatus;

/**
 * @author johnl
 * @since 2/24/2022
 */

public class InvalidTokenException extends RuntimeException {
    private final HttpStatus status;

    public InvalidTokenException(String message) {
        this(message, HttpStatus.INVALID_TOKEN);
    }

    public InvalidTokenException(String message, HttpStatus status) {
        super(message);
        this.status = status;
    }
}
