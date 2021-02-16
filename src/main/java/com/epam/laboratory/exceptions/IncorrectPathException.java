package com.epam.laboratory.exceptions;

import java.io.FileNotFoundException;

public class IncorrectPathException extends FileNotFoundException {

    public IncorrectPathException(String message) {
        super(message);
    }
}
