package com.waifucomics.waifuwebapp.controllers;

import com.waifucomics.waifuwebapp.entitites.Account;
import com.waifucomics.waifuwebapp.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
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