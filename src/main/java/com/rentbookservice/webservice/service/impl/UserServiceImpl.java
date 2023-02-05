package com.rentbookservice.webservice.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rentbookservice.webservice.constant.Actions;
import com.rentbookservice.webservice.constant.ApiResponseMessage;
import com.rentbookservice.webservice.entity.User;
import com.rentbookservice.webservice.repository.UserRepository;
import com.rentbookservice.webservice.service.UserService;
import com.rentbookservice.webservice.utils.ApiResponse;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public ApiResponse<User> createUser(User user) {

        // Check for required fields

        // Check duplicate entry [email, phoneNumber]
        Optional<User> isUserExistByEmail = userRepository.findByEmail(user.getEmail());
        if (isUserExistByEmail.isPresent()) {
            return new ApiResponse<>(409, ApiResponseMessage.EMAIL_ALREADY_EXIST, Actions.CREATE_USER,
                    null);
        }

        Optional<User> isUserExistByPhoneNumber = userRepository.findByPhoneNumber(user.getPhoneNumber());
        if (isUserExistByPhoneNumber.isPresent()) {
            return new ApiResponse<>(409, ApiResponseMessage.PHONE_NUMBER_ALREADY_EXIST, Actions.CREATE_USER,
                    null);
        }

        // Save user
        User savedUser = userRepository.save(user);
        return new ApiResponse<>(201, ApiResponseMessage.CREATED_SUCCESSFULLY, Actions.CREATE_USER,
                savedUser);
    }

    @Override
    public User getUserById(Long userId) {
        Optional<User> optionalUser = userRepository.findById(userId);
        return optionalUser.get();
    }
}
