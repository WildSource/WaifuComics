package com.waifucomics.waifuwebapp.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistService
{
    private ArtistRepository repository;

    @Autowired
    public ArtistService(ArtistRepository repository)
    {
        this.repository = repository;
    }

    //read
    public Optional<Artist> readArtistById(Long id)
    {
        return getRepository().findById(id);
    }

    //read
    public Optional<Artist> readArtistByName(String name)
    {
        return Optional.ofNullable(getRepository().findByName(name));
    }

    //create
    public void createArtist(Artist artist)
    {
        getRepository().save(artist);
    }

    public void updateArtistName(String name)
    {
        getRepository().
    }

    //delete
    public void deleteArtistByArtist(Artist artist)
    {
        getRepository().delete(artist);
    }

    //delete
    public void deleteArtistById(Long id)
    {
        getRepository().deleteById(id);
    }

    public ArtistRepository getRepository()
    {
        return repository;
    }

    public void setRepository(ArtistRepository repository)
    {
        this.repository = repository;
    }
}
