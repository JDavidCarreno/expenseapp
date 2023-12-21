package com.jdcg.expensesapi.dao;


import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.dao.dto.ExpenseDto;

public interface ExpenseRepository extends CRUD<Expense, Integer, Expense>{
    Expense getExpenseById(Integer id);
}
