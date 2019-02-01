package com.OnlineShop.Application.demo.resource;

import com.OnlineShop.Application.demo.model.Products;
import com.OnlineShop.Application.demo.model.Users;
import com.OnlineShop.Application.demo.repository.ProductsRepository;
import com.OnlineShop.Application.demo.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(name = "/OnlineShop")
public class ShopPortal {

    @Autowired
    UsersRepository usersRepository;
    ProductsRepository productsRepository;

    @RequestMapping(value = "/CreateUser",method = RequestMethod.PUT,consumes = "application/json")
    public void CreateUser(@RequestBody final  Users users){
        Users users1 = new Users();
        users1.setAccountType( users.getAccountType());
        users1.setAddress(users.getAddress());
        users1.setEmailId(users.getEmailId());
        users1.setMobileNo(users.getMobileNo());
        users1.setPassword(users.getPassword());
        usersRepository.save(users1);
    }
}
