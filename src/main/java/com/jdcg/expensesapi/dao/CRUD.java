package com.jdcg.expensesapi.dao;

import java.util.List;

public interface CRUD <T, K, L>{
    Integer create(L l);
/*    List<L> getAll();
    void update(T t);
    void delete(K k);*/
}
