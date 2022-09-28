package com.waifucomics.waifuwebapp.repositories;

import com.waifucomics.waifuwebapp.entitites.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {}
