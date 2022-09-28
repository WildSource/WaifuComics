package com.waifucomics.waifuwebapp.services;

import com.waifucomics.waifuwebapp.entitites.Artist;
import com.waifucomics.waifuwebapp.repositories.ArtistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArtistService
{
    private ArtistRepository repository;

    public ArtistService() {}

    @Autowired
    public ArtistService(ArtistRepository repository)
    {
        this.repository = repository;
    }

    //read
    public Optional<Artist> readArtistById(Long id)
    {
        return this.repository.findById(id);
    }

    // update
    public void updateArtistNameWithID(Long id, String name)
    {
        Optional<Artist> artistToChange = this.repository.findById(id);
        artistToChange.get().setName(name);
        this.repository.save(artistToChange.get());
    }

    //create
    public void createArtist(Artist artist)
    {
        this.repository.save(artist);
    }

    //delete
    public void deleteArtistById(Long id)
    {
        this.repository.deleteById(id);
    }

}
