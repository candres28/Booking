package co.com.devco.certification.exceptions;

@SuppressWarnings("serial")
public class CreateAccountException extends AssertionError {

    public CreateAccountException(String message, Throwable cause) {
        super(message, cause);
    }
}