package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.controllers.ComicController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutView {
    ComicController controller;

    @Autowired
    public AboutView(ComicController controller) {
        this.controller = controller;
    }

    @GetMapping("/about")
    String helloAccount(Model model) {
        return "about/about.html";
    }
}
