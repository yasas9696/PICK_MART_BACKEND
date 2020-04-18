package com.myproject.pick_market.admin;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    AdminService adminService;


    //Test
    @RequestMapping(value = "/test")
    public String testing() {
        return "Test Function is Working";
    }


    //Add new admin
    @RequestMapping(value = "/newAdmin")
    public Admin save(@RequestBody Admin admin) {
        Admin adminSave = adminService.save(admin);
        log.info("Admin Added, USER_ID : {} ", adminSave.getRecordId());

        return adminSave;
    }


    //Get all admin
    @RequestMapping(value = "/getAll")
    public List<Admin> getAdmin() {
        return adminService.getAllAdmin();
    }
}
