package com.waifucomics.waifuwebapp.repositories;

import com.waifucomics.waifuwebapp.entitites.Comic;
import org.springframework.data.repository.CrudRepository;

public interface ComicRepository extends CrudRepository<Comic, Long> {}
