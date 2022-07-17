package com.LensCart.entity;

import lombok.Data;
import javax.persistence.*;


@Entity
@Data
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String name;
    private String password;
    private String role;


}
