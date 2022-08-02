package com.waifucomics.waifuwebapp.comic;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComicView
{
	@GetMapping("/")
	public String getOutput(Model model)
	{
		model.addAttribute("attrib", "This is from the controller");
		return "index";
	}
}
