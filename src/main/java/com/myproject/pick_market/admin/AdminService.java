package com.myproject.pick_market.admin;


import java.util.List;

public interface AdminService {
    Admin save(Admin admin);

    List<Admin> getAllAdmin();
}
