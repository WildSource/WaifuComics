package com.waifucomics.waifuwebapp.artist;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long>
{
    Artist findByName(String name);

    @Modifying
    @Query(value = "UPDATE Artist")
    void updateByName(String name);
}
