package com.maneesh.errorHandling;

public class DepartmentNotFoundException extends Exception {
    public DepartmentNotFoundException(String message) {
        super(message);
    }

    public DepartmentNotFoundException() {
        super();
    }

    public DepartmentNotFoundException(Throwable cause) {
        super(cause);
    }

    public DepartmentNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}