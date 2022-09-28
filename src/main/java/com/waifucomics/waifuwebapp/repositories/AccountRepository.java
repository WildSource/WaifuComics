package com.waifucomics.waifuwebapp.repositories;

import com.waifucomics.waifuwebapp.entitites.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {}
