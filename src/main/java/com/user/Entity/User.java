package com.user.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Integer resId;
    private Integer resNumber;
    private String resAdd;
    private String resName;
    private Integer resAge;

}
