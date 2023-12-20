package com.jdcg.expensesapi.service.impl;

import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.dao.ExpenseRepository;
import com.jdcg.expensesapi.dto.request.ExpenseRequestDto;
import com.jdcg.expensesapi.service.ExpenseService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseServiceImpl implements ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseServiceImpl(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    @Override
    public String createExpense(ExpenseRequestDto expenseRequestDto) {
        String response = "Se registró el gasto correctamente";
        Expense expense = mapDtoToExpense(expenseRequestDto);
        Integer responseCreation = expenseRepository.create(expense);
        if (responseCreation.equals(0)) {
            System.out.println("No se insertó ningun registro");
        }
        return response;
    }

    @Override
    public List<Expense> getAllExpenses() {
        return expenseRepository.getAll();
    }

    private Expense mapDtoToExpense(ExpenseRequestDto expenseRequestDto){
        Expense expense = new Expense();
        expense.setAmount(expenseRequestDto.getAmount());
        expense.setCategoryName(expenseRequestDto.getExpenseCategoryRequestDto().getName());
        expense.setDate(expenseRequestDto.getDate());
        return expense;
    }
}
