package co.com.devco.certification.exceptions;

@SuppressWarnings("serial")
public class SearchTaxisException extends AssertionError {

    public SearchTaxisException(String message, Throwable cause) {
        super(message, cause);
    }
}
