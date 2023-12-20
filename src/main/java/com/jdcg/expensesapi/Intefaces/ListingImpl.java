package com.jdcg.expensesapi.Intefaces;

import java.util.List;

public class ListingImpl<T> implements Listing<T> {
    @Override
    public void listingElements(List<T> list) {
        int index = 1;
        for (T e : list) {
            System.out.println(index + ". " + e);
            index++;
        }
    }
}
