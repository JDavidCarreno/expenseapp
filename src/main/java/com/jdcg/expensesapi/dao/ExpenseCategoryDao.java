package com.jdcg.expensesapi.dao;


import com.jdcg.expensesapi.Entities.ExpenseCategory;
import com.jdcg.expensesapi.dao.dto.ExpenseCategoryDto;

public interface ExpenseCategoryDao extends CRUD<ExpenseCategory, Integer, ExpenseCategoryDto>{
    ExpenseCategory getByName(String name);
}
