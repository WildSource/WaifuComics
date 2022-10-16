package com.waifucomics.waifuwebapp.controllers;

import com.waifucomics.waifuwebapp.entitites.Account;
import com.waifucomics.waifuwebapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/server/account")
public class AccountController {
    private AccountService service;

    @Autowired
    public AccountController(AccountService service) {
        this.service = service;
    }

    @GetMapping
    public Optional<Account> READAccount(Long id)
    {
        return this.service.readAccountById(id);
    }

    @PostMapping
    public void POSTAccount(String username, String password) {
        service.createAccount(new Account(username,password));
    }

    @PutMapping
    public void PUTAccount(Long id, String username)
    {
        this.service.updateUsernameById(id, username);
    }

    @DeleteMapping
    public void DElETEAccount(Long id)
    {
        this.service.deleteAccountById(id);
    }
}
