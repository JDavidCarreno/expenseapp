package com.jdcg.expensesapi.dao.impl;



import com.jdcg.expensesapi.Entities.Expense;
import com.jdcg.expensesapi.Entities.ExpenseCategory;
import com.jdcg.expensesapi.dao.ExpenseRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ExpenseRepositoryImpl implements ExpenseRepository {
    private static final String INSERT_INTO_CATEGORY_EXPENSE = "INSERT INTO expensecategory (name) VALUES (?)";
    private static final String SELECT_FROM_EXPENSE_CATEGORY_BY_NAME = "SELECT * FROM expensecategory WHERE name = ?";
    private static final String INSERT_INTO_EXPENSE = "INSERT INTO Expense (amount, category_id, category_name, date) VALUES (?, ?, ?, ?)";
    private final JdbcTemplate jdbcTemplate;

    public ExpenseRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Integer create(Expense expense) {
        jdbcTemplate.update(INSERT_INTO_CATEGORY_EXPENSE, expense.getCategoryName().toLowerCase());

        Object[] params = {expense.getCategoryName()};
        int[] types = {1};

        ExpenseCategory expenseCategory = jdbcTemplate.queryForObject(SELECT_FROM_EXPENSE_CATEGORY_BY_NAME, params, types, new ExpenseCategoryRowMapper());

        assert expenseCategory != null;
        return jdbcTemplate.update(INSERT_INTO_EXPENSE, expense.getAmount(), expenseCategory.getId(), expenseCategory.getName(), expense.getDate());
    }

    static class ExpenseCategoryRowMapper implements RowMapper<ExpenseCategory> {
        @Override
        public ExpenseCategory mapRow(ResultSet rs, int rowNum) throws SQLException {
            ExpenseCategory expenseCategory = new ExpenseCategory();
            expenseCategory.setId(rs.getInt("id"));
            expenseCategory.setName(rs.getString("name"));
            return expenseCategory;
        }
    }

/*    @Override
    public List<Expense> getAll() {
        List<Expense> expenseDtoList = new ArrayList<>();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM expense");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Double amount = resultSet.getDouble("amount");
                Integer categoryId = resultSet.getInt("expensecategoryid");
                String date = resultSet.getString("date");
                Expense expense = new Expense(amount, categoryId,date);
                expenseDtoList.add(expense);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return expenseDtoList;
    }

    @Override
    public void update(Expense expense) {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(
                    "UPDATE expense SET amount = ?, expensecategoryid = ?, date = ? WHERE id = ?");
            preparedStatement.setDouble(1, expense.getAmount());
            preparedStatement.setInt(2, expense.getCategoryId());
            preparedStatement.setString(3, expense.getDate());
            preparedStatement.setInt(4, expense.getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void delete(Integer integer) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(
                    "DELETE FROM expense WHERE id = ?");
            preparedStatement.setInt(1, integer);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }*/
}
