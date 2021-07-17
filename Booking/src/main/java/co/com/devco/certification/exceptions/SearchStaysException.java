package co.com.devco.certification.exceptions;

@SuppressWarnings("serial")
public class SearchStaysException extends AssertionError {

    public SearchStaysException(String message, Throwable cause) {
        super(message, cause);
    }
}