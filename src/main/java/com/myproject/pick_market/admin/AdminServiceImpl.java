package com.myproject.pick_market.admin;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    //Add new member
    @Override
    public Admin save(Admin admin) {
        return adminRepository.save(admin);
    }


    public List<Admin> getAllAdmin() {
        return adminRepository.findAll();
    }
}