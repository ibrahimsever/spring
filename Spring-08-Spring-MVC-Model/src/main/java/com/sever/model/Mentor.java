package com.sever.model;

import com.sever.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Mentor {

    private String firstName;
    private String lastname;
    private int Age;
    private Gender gender;
}
