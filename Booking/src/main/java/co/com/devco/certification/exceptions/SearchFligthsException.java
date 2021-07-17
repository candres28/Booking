package co.com.devco.certification.exceptions;

@SuppressWarnings("serial")
public class SearchFligthsException extends AssertionError {

    public SearchFligthsException(String message, Throwable cause) {
        super(message, cause);
    }
}