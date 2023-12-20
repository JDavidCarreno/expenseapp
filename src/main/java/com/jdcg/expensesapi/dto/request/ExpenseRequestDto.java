package com.jdcg.expensesapi.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExpenseRequestDto {
    private Double amount;
    private ExpenseCategoryRequestDto expenseCategoryRequestDto;
    private String date;
}
