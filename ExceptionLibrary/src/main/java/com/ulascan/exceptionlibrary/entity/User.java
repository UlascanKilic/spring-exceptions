package com.ulascan.exceptionlibrary.entity;

import com.ulascan.exceptionlibrary.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private Integer id;

    private String name;

    private String lastname;

    private String email;

    private Integer age;

    private Gender gender;
}
