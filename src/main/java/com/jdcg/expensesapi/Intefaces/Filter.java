package com.jdcg.expensesapi.Intefaces;

import com.jdcg.expensesapi.Entities.Expense;

import java.util.List;
import java.util.function.Predicate;

public interface Filter {
    List<Expense> filter(List<Expense> expenses, Predicate<Expense> predicate);
}
