package com.jdcg.expensesapi.serviceTest;

import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.dao.ExpenseRepository;
import com.jdcg.expensesapi.dto.request.ExpenseCategoryRequestDto;
import com.jdcg.expensesapi.dto.request.ExpenseRequestDto;
import com.jdcg.expensesapi.service.impl.ExpenseServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ExpenseServiceImplTest {

    @Mock
    private ExpenseRepository expenseRepository;

    @InjectMocks
    private ExpenseServiceImpl expenseService;

    @Test
    public void testCreateExpense_Successful() {
        // Arrange
        ExpenseRequestDto expenseRequestDto = new ExpenseRequestDto(100.0, new ExpenseCategoryRequestDto("Food"), "2023-01-01");
        when(expenseRepository.create(any())).thenReturn(1);

        // Act
        String result = expenseService.createExpense(expenseRequestDto);

        // Assert
        verify(expenseRepository, times(1)).create(any());
        assertEquals("Se registró el gasto correctamente", result);
    }


    @Test
    public void testCreateExpense_ZeroAmount() {
        // Arrange
        ExpenseRequestDto expenseRequestDto = new ExpenseRequestDto(0.0, new ExpenseCategoryRequestDto("Groceries"), "2023-01-01");

        // Act
        String result = expenseService.createExpense(expenseRequestDto);

        // Assert
        assertEquals("Se registró el gasto correctamente", result);
    }

    @Test
    public void testGetAllExpenses() {
        // Arrange
        List<Expense> mockExpenseList = List.of(new Expense(), new Expense());
        when(expenseRepository.getAll()).thenReturn(mockExpenseList);

        // Act
        List<Expense> result = expenseService.getAllExpenses();

        // Assert
        verify(expenseRepository, times(1)).getAll();
        assertSame(mockExpenseList, result);
    }

    @Test
    public void testGetExpenseById() {
        // Arrange
        Integer expenseId = 1;
        Expense mockExpense = new Expense();
        when(expenseRepository.getExpenseById(expenseId)).thenReturn(mockExpense);

        // Act
        Expense result = expenseService.getExpenseById(expenseId);

        // Assert
        verify(expenseRepository, times(1)).getExpenseById(expenseId);
        assertSame(mockExpense, result);
    }
}


