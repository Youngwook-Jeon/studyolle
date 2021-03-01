package com.studyolle.studyolle.account;

import com.studyolle.studyolle.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AccountController {

    @GetMapping("/sign-up")
    public String signUp(Model model) {
        Account account = new Account();
        model.addAttribute("nickname", account.getNickname());
        model.addAttribute("email", account.getEmail());
        model.addAttribute("password", account.getPassword());

        return "account/sign-up";
    }
}
