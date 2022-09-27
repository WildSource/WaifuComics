package com.waifucomics.waifuwebapp.comic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class ComicService {
    private ComicRepository repository;

    @Autowired
    public ComicService(ComicRepository comicRepository) {
        this.repository = comicRepository;
    }

    public ComicRepository getRepository() {
        return repository;
    }

    public void setRepository(ComicRepository repository) {
        this.repository = repository;
    }
}
