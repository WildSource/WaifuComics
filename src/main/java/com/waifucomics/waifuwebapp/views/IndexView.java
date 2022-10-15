package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.controllers.ComicController;
import com.waifucomics.waifuwebapp.entitites.Comic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Landing page view
 */
@Controller
public class IndexView {
    ComicController controller;
    Comic comic;

    @Autowired
    public IndexView(ComicController controller) {
        this.controller = controller;
    }

    @GetMapping()
    String helloComic(Model model) {
        this.comic = controller.READComic(3L);
        model.addAttribute("name", comic.getComicName());
        return "index/index.html";
    }
}
