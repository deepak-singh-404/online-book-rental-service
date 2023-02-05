package com.rentbookservice.webservice.service;

import com.rentbookservice.webservice.entity.User;
import com.rentbookservice.webservice.utils.ApiResponse;

public interface UserService {
    ApiResponse<User> createUser(User user);

    User getUserById(Long userId);

}
