package com.OnlineShop.Application.demo.repository;

import com.OnlineShop.Application.demo.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users , Integer> {

}
