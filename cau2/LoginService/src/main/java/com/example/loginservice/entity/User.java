package com.example.loginservice.entity;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    private String userId;
    private String username;
    private String password;
    private String email;

}
