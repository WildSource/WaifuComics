package com.waifucomics.waifuwebapp.views;

import com.waifucomics.waifuwebapp.entitites.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginView {

    @GetMapping("/login")
    String loginPage(Model model){
        Account account = new Account();
        model.addAttribute("loginInfo", account);
        return "login/login.html";
    }
}
