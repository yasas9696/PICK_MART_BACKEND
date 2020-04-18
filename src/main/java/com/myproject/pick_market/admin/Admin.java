package com.myproject.pick_market.admin;


import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "user")
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RECORD_ID")
    private int recordId;

    @Column(name = "ROLE_CODE")
    private int roleCode = 2;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "ID_NUMBER")
    private String idNumber;

    @Column(name = "ADMIN_USERNAME")
    private String adminUsername;

    @Column(name = "ADMIN_PASSWORD")
    private String adminPassword;

}