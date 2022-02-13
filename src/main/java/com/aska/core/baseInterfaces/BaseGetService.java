package com.aska.core.baseInterfaces;

import com.aska.core.utilities.results.DataResult;

import java.util.List;

public interface BaseGetService<T,E> {
    DataResult<List<T>> getAll();
    DataResult<T> get(int id);
    DataResult<E> getById(int id);

}
