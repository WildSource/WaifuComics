package com.waifucomics.waifuwebapp.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ArtistController
{
    private ArtistService service;

    @Autowired
    public ArtistController(ArtistService service)
    {
        this.service = service;
    }

    // read
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

    public void UPDATEArtistName(String name)
    {
        getService().
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
