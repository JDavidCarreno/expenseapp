package com.jdcg.expensesapi.Entities;


import lombok.Getter;
import lombok.Setter;

public class Expense {
    private static Integer id_counter = 0;
    @Getter
    @Setter
    private Integer id;
    @Getter
    private Double amount;
    @Setter
    private Integer expenseCategoryId;
    @Getter
    @Setter
    private String categoryName;
    @Getter
    private String date;

    public Expense() {
        this.id = id_counter;
        id_counter++;
    }

    public Expense(Double amount, Integer expenseCategoryId, String date) {
        this.id = id_counter;
        this.amount = amount;
        this.expenseCategoryId = expenseCategoryId;
        this.date = date;
        id_counter++;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCategoryId() {
        return expenseCategoryId;
    }

    public void setCategory(Integer expenseCategoryId) {
        this.expenseCategoryId = expenseCategoryId;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", amount=" + amount +
                ", category=" + expenseCategoryId +
                ", date='" + date + '\'' +
                '}';
    }
}
