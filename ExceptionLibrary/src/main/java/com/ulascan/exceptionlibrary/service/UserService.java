package com.ulascan.exceptionlibrary.service;

import com.ulascan.exceptionlibrary.enums.UserExceptionStatus;
import com.ulascan.exceptionlibrary.exceptions.BadRequestException;
import com.ulascan.exceptionlibrary.util.GenericStatusCodes;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{


    @Override
    public void getUser() {
        throw new BadRequestException(UserExceptionStatus.USER_NOT_FOUND.getMessage(),
                UserExceptionStatus.USER_NOT_FOUND);
    }

    @Override
    public void getEmail() {
        throw new BadRequestException(UserExceptionStatus.USER_EMAIL_IN_USE.getMessage(),
                UserExceptionStatus.USER_EMAIL_IN_USE);
    }

    @Override
    public void getGenericError() {
        throw new BadRequestException("DNS Problem occurred!", GenericStatusCodes.EDUVERSE_DNS);
    }
}
