package uz.oyatjon.security_rest.exception;

/**
 * @author johnl
 * @since 2/24/2022
 */
public class BadRequestException extends RuntimeException{
    public BadRequestException(String message, Throwable cause) {
        super(message, cause);
    }
}
