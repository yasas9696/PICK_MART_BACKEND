package com.myproject.pick_market.user;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;

    @Column(name = "ROLE_CODE")
    private int roleCode;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "USER_USERNAME")
    private String userUsername;

    @Column(name = "USER_PASSWORD")
    private String userPassword;

}
