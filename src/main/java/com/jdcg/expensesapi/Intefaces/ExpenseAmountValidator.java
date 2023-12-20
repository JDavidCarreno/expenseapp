package com.jdcg.expensesapi.Intefaces;

import com.jdcg.expensesapi.Exceptions.InvalidExpenseException;

@FunctionalInterface
public interface ExpenseAmountValidator {
    boolean validateAmount(double amount) throws InvalidExpenseException;
}
