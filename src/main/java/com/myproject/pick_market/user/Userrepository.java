package com.myproject.pick_market.user;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Userrepository extends JpaRepository<User, Integer> {
}
