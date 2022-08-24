package com.waifucomics.waifuwebapp.comic;

import org.springframework.stereotype.Service;

@Service
public class ComicService {
    public ComicModel getComic()
    {
        return new ComicModel("ArtBook", "Picasso", 28);
    }
}
