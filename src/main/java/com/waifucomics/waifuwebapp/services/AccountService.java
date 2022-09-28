package com.waifucomics.waifuwebapp.services;

import com.waifucomics.waifuwebapp.entitites.Account;
import com.waifucomics.waifuwebapp.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService
{
    private AccountRepository repository;

    public AccountService() {}

    @Autowired
    public AccountService(AccountRepository repository)
    {
        this.repository = repository;
    }

    // read
    public Optional<Account> readAccountById(Long id)
    {
        return this.repository.findById(id);
    }

    // update the username
    public void updateUsernameById(Long id, String username)
    {
        Optional<Account> temp = this.repository.findById(id);
        temp.get().setUsername(username);
        this.repository.save(temp.get());
    }

    // create account
    public void createAccount(Account account)
    {
        this.repository.save(account);
    }

    // delete account
    public void deleteAccountById(Long id)
    {
        this.repository.deleteById(id);
    }
}
