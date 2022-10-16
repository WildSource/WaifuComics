package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.controllers.ComicController;
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

    @Autowired
    public IndexView(ComicController controller) {
        this.controller = controller;
    }

    @GetMapping()
    String helloComic(Model model) {
        return "index/index.html";
    }
}
