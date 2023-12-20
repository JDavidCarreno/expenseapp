package com.jdcg.expensesapi.service;

import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.dto.request.ExpenseRequestDto;

import java.util.List;

public interface ExpenseService {
    String createExpense(ExpenseRequestDto expenseRequestDto);
    List<Expense> getAllExpenses();
}
