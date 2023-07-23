package calc.exceptions;

import java.io.IOException;

public class InputException extends IOException {

    private String input;
    private String inputHeader;

    public InputException(String message, String input, String inputHeader) {
        super(message);
        this.input = input;
        this.inputHeader = inputHeader;
    }
}
