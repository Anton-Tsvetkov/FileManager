package com.epam.laboratory.exceptions;

import java.io.IOException;

public class IncorrectPathException extends IOException {

    public IncorrectPathException(String message) {
        super(message);
    }
}
