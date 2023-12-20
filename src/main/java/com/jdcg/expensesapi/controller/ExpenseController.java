package com.jdcg.expensesapi.controller;

import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.dto.request.ExpenseRequestDto;
import com.jdcg.expensesapi.service.ExpenseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/expense")
public class ExpenseController {
    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping
    public ResponseEntity<String> createExpenseHandler(@RequestBody ExpenseRequestDto expenseRequestDto){
        String response = expenseService.createExpense(expenseRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<Expense>> getAllExpensesHandler(){
        return ResponseEntity.status(HttpStatus.OK).body(expenseService.getAllExpenses());
    }
}
