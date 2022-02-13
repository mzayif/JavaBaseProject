package com.aska.core.baseInterfaces;


import com.aska.core.exeptions.AlreadyExists;
import com.aska.core.utilities.results.Result;
import com.aska.core.utilities.results.SuccessResult;

public interface AddService<T extends IRequest> {
    /**
     * Base Add metodu. Belirtilen T nesnesi için
     * @param createRequest
     * @return İşlem başarılı tamamlanmış ise @{@link SuccessResult}
     * @throws AlreadyExists Aynı isimden başka bir kayıt var ise
     */
    Result add(T createRequest);
}

