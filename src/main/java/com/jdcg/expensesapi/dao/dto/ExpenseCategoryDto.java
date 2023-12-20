package com.jdcg.expensesapi.dao.dto;

import lombok.Data;

@Data
public class ExpenseCategoryDto {
    private String name;
    private Integer amount;

    public ExpenseCategoryDto() {
    }

    public ExpenseCategoryDto(String name, Integer amount) {
        this.name = name;
        this.amount = amount;
    }

}
