package com.aska.users.business.abstracts;

import com.aska.core.auth.AppUserService;
import com.aska.core.baseInterfaces.*;
import com.aska.legalCollection.core.baseInterfaces.*;
import com.aska.users.models.entities.User;
import com.aska.users.models.requests.CreateUserRequest;
import com.aska.users.models.requests.UpdateUserRequest;
import com.aska.users.models.responses.UserListDto;

public interface UserService extends AppUserService,
        AddService<CreateUserRequest>,
        BaseGetService<UserListDto, User>, UpdateService<UpdateUserRequest>, DeleteService, CheckIfExistService {

    User getUserById(int id);

    User getUserByEmail(String email);

}
