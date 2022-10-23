package com.example.registerservice.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@Entity @Getter
@Setter @AllArgsConstructor
@NoArgsConstructor @Builder @Table
public class Register implements Serializable {
    @Id
    @Column(name = "userid")
    private String userId;
    private String username;
    private String password;
    private String email;

}
