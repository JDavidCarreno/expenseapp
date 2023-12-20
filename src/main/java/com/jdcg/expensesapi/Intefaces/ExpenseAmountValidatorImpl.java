package com.jdcg.expensesapi.Intefaces;


import com.jdcg.expensesapi.Exceptions.InvalidExpenseException;

public class ExpenseAmountValidatorImpl implements ExpenseAmountValidator {
    @Override
    public boolean validateAmount(double amount) throws InvalidExpenseException {
        if (amount < 0){
            throw new InvalidExpenseException("El monto debe ser mayor o igual a 0");
        }
        return false;
    }
}
