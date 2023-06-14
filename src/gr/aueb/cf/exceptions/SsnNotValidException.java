package gr.aueb.cf.exceptions;

import java.net.PortUnreachableException;

public class SsnNotValidException extends Exception{
    private static final long serialVersionUID = 1L;

    public SsnNotValidException(String ssn){
        super("Ssn " + ssn + " is not valid");
    }
}
