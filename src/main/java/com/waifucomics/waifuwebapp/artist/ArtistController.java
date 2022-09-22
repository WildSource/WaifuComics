package com.waifucomics.waifuwebapp.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ArtistController
{
    private ArtistService service;

    public ArtistController() {}

    @Autowired
    public ArtistController(ArtistService service)
    {
        this.service = service;
    }

    // read
    @GetMapping("/")
    public Optional<Artist> GETArtistById(Long id)
    {
        return getService().readArtistById(id);
    }

    // read
    public Optional<Artist> GETArtistByArtist(String name)
    {
        return getService().readArtistByName(name);
    }

    // post
    public void PUTArtist(Artist artist)
    {
        getService().createArtist(artist);
    }

    // update
    public void UPDATEArtistNameWithArtist(Artist artistToChange, String name)
    {
        getService().updateArtistNameWithArtist(artistToChange, name);
    }

    // update
    public void UPDATEArtistNameWithId(Long id, String name)
    {
        getService().updateArtistNameWithID(id, name);
    }

    // delete
    public void DELETEArtistByArtist(Artist artist)
    {
        getService().deleteArtistByArtist(artist);
    }

    // delete
    public void DELETEArtistById(Long id)
    {
        getService().deleteArtistById(id);
    }

    public ArtistService getService()
    {
        return service;
    }

    public void setService(ArtistService service)
    {
        this.service = service;
    }
}
