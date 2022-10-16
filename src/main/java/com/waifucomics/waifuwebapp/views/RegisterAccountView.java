package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.controllers.AccountController;
import com.waifucomics.waifuwebapp.entitites.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterAccountView {
    AccountController controller;

    @Autowired
    public RegisterAccountView(AccountController controller) {
        this.controller = controller;
    }

    @GetMapping("/register")
    String registerAccount(Model model) {
        Account account = new Account();
        model.addAttribute("account", account);
        return "/registerAccount/register.html";
    }

    @PostMapping("/registerSucess")
    String showAccount(@ModelAttribute("account") Account account) {
        controller.POSTAccount(account.getUsername(), account.getPassword());
        return "/registerAccount/registerSucess.html";
    }
}
