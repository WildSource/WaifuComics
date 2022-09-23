package com.waifucomics.waifuwebapp.Account;

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
        return getRepository().findById(id);
    }

    // read
    public Optional<Account> readAccountByUsername(String username)
    {
        return Optional.ofNullable(getRepository().findByUsername(username));
    }

    public AccountRepository getRepository()
    {
        return repository;
    }

    public void setRepository(AccountRepository repository)
    {
        this.repository = repository;
    }
}
