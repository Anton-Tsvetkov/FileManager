package com.epam.laboratory.exceptions;

import java.io.IOException;

public class IncorrectFileNameException extends IOException {

    public IncorrectFileNameException(String message) {
        super(message);
    }
}
