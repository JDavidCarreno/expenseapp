package com.jdcg.expensesapi.Intefaces;


import com.jdcg.expensesapi.Entities.Expense;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


public class FilterImpl implements Filter {
    @Override
    public List<Expense> filter(List<Expense> expenses, Predicate<Expense> predicate) {
        List<Expense> result = new ArrayList<>();
        expenses.forEach(expense -> {
            if (predicate.test(expense)) result.add(expense);
        });
        return result;
    }
}
