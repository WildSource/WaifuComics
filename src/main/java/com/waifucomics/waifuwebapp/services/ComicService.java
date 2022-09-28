package com.waifucomics.waifuwebapp.services;

import com.waifucomics.waifuwebapp.entitites.Comic;
import com.waifucomics.waifuwebapp.repositories.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ComicService {
    private ComicRepository repository;

    @Autowired
    public ComicService(ComicRepository comicRepository) {
        this.repository = comicRepository;
    }

    // read
   public Optional<Comic> readComicById(Long id)
   {
       return this.repository.findById(id);
   }

   // update
   public void updateComicById(Long id, String comicName)
   {
        Optional<Comic> temp = this.repository.findById(id);
        temp.get().setComicName(comicName);
        this.repository.save(temp.get());
   }

   // create
    public void createComic(Comic comic)
    {
        this.repository.save(comic);
    }

    // delete
    public void deleteComicById(Long id)
    {
        this.repository.deleteById(id);
    }
}
