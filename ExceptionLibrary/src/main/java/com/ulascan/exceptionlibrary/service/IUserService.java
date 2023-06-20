package com.ulascan.exceptionlibrary.service;

import com.ulascan.exceptionlibrary.dto.UserDTO;

public interface IUserService {
    UserDTO getUser();

    String throwException();
}
