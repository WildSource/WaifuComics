package com.waifucomics.waifuwebapp.controllers;

import com.waifucomics.waifuwebapp.entitites.Artist;
import com.waifucomics.waifuwebapp.services.ArtistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("v1/artist")
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
    @GetMapping
    public Optional<Artist> GETArtistById(Long id)
    {
        return this.service.readArtistById(id);
    }

    // put
    @PostMapping
    public void POSTArtist(Artist artist)
    {
        this.service.createArtist(artist);
    }

    // update
    @PutMapping
    public void UPDATEArtistNameWithId(Long id, String name)
    {
        this.service.updateArtistNameWithID(id, name);
    }

    // delete
    @DeleteMapping
    public void DELETEArtistById(Long id)
    {
        this.service.deleteArtistById(id);
    }
}
