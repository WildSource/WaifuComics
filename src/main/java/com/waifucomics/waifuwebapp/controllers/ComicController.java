package com.waifucomics.waifuwebapp.controllers;

import com.waifucomics.waifuwebapp.entitites.Comic;
import com.waifucomics.waifuwebapp.services.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("v1/server/comic")
public class ComicController {

    private ComicService service;

    @Autowired
    public ComicController(ComicService service) {
        this.service = service;
    }

    @GetMapping("/{id}")
    public Comic READComic(@PathVariable Long id)
    {
        return this.service.readComicById(id).get();
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
