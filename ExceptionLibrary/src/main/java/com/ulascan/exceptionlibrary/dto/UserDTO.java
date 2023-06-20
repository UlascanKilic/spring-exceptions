package com.ulascan.exceptionlibrary.dto;

import com.ulascan.exceptionlibrary.enums.Gender;

public record UserDTO(String name,
                      String lastName,
                      String email,
                      Integer age,
                      Gender gender) {
}
