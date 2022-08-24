package com.waifucomics.waifuwebapp.comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ComicController {
    private ComicService service;

    @Autowired
    public ComicController(ComicService service)
    {

    }

    @GetMapping("/comic")
    public ComicModel RequestComic(ComicService service)
    {
        return service.getComic();
    }
}
