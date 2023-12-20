package com.jdcg.expensesapi.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ExpenseCategory {
    private Integer id;
    private String name;
}
