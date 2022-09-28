package com.waifucomics.waifuwebapp.controllers;

import com.waifucomics.waifuwebapp.entitites.Comic;
import com.waifucomics.waifuwebapp.services.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class ComicController {

    private ComicService service;

    @Autowired
    public ComicController(ComicService service) {
        this.service = service;
    }

    @GetMapping
    public Optional<Comic> READComic(Long id)
    {
        return this.service.readComicById(id);
    }

    @PutMapping
    public void PUTComic(Long id, String comicName)
    {
        this.service.updateComicById(id, comicName);
    }

    @PostMapping
    public void POSTComic(Comic comic)
    {
        this.service.createComic(comic);
    }

    @DeleteMapping
    public void DELETEComic(Long id)
    {
        this.service.deleteComicById(id);
    }
}
