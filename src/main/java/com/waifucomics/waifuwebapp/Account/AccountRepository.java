package com.waifucomics.waifuwebapp.Account;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long>
{
    Account findByUsername(String name);
}
