package com.epam.laboratory.exceptions;

import java.io.FileNotFoundException;

public class IncorrectFileNameException extends FileNotFoundException {

    public IncorrectFileNameException(String message) {
        super(message);
    }
}
