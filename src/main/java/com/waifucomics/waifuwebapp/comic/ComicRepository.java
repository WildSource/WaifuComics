package com.waifucomics.waifuwebapp.comic;

import com.waifucomics.waifuwebapp.artist.Artist;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ComicRepository extends CrudRepository<Comic, Long> {
    Comic findByName(String name);

    List<Comic> findByArtist(Artist artist);
}
