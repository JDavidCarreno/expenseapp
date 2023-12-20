package com.jdcg.expensesapi.Intefaces;



import com.jdcg.expensesapi.Entities.Expense;

import java.util.List;

public interface ExpenseCalculator {
    double calculateExpense(Expense expense);
    double calculateTotalExpense(List<Expense> expenses);
}
