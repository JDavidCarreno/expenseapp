package com.jdcg.expensesapi.service;

import com.jdcg.expensesapi.dto.request.ExpenseRequestDto;

public interface ExpenseService {
    String createExpense(ExpenseRequestDto expenseRequestDto);
}
