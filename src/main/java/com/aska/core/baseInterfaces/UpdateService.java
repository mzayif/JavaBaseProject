package com.aska.core.baseInterfaces;

import com.aska.core.utilities.results.Result;

public interface UpdateService<T> {
    Result update(T updateRequest);

}
