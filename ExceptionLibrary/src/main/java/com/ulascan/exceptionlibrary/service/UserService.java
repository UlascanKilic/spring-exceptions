package com.ulascan.exceptionlibrary.service;

import com.ulascan.exceptionlibrary.dto.UserDTO;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{


    @Override
    public UserDTO getUser() {
        return null;
    }

    @Override
    public String throwException() {
        throw new IllegalStateException("Some exception happened");
    }
}
