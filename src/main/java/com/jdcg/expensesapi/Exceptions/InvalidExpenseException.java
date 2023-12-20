package com.jdcg.expensesapi.Exceptions;

public class InvalidExpenseException extends Exception {
    public InvalidExpenseException(String message) {
        super(message);
    }
}
