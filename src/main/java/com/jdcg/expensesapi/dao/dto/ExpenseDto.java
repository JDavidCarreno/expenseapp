package com.jdcg.expensesapi.dao.dto;


public class ExpenseDto {
    private Double amount;
    private Integer categoryId;
    private String date;

    public ExpenseDto() {
    }

    public ExpenseDto(Double amount, Integer categoryId, String date) {
        this.amount = amount;
        this.categoryId = categoryId;
        this.date = date;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ExpenseDto{" +
                "amount=" + amount +
                ", categoryId=" + categoryId +
                ", date='" + date + '\'' +
                '}';
    }
}
