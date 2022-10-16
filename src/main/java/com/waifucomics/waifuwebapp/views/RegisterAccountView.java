package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.entitites.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterAccountView {
    @GetMapping("/register")
    String registerAccount(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "/registerAccount/register.html";
    }

    @PostMapping("/registerSucess")
    String showAccount(@ModelAttribute("account") Account account) {
        System.out.println(account);
        return "/registerAccount/registerSucess.html";
    }
}
