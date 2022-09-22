package com.waifucomics.waifuwebapp.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Component
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

    // update
    public void updateArtistNameWithArtist(Artist artistToChange, String name)
    {
        artistToChange.setName(name);
        getRepository().save(artistToChange);
    }

    // update
    public void updateArtistNameWithID(Long id, String name)
    {
        Optional<Artist> artistToChange = getRepository().findById(id);
        artistToChange.get().setName(name);
        getRepository().save(artistToChange.get());
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
