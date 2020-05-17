package guru.springframework.controllers;

import guru.springframework.comands.SignInCommand;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class SignInController {

    @RequestMapping("/signin")
    public String signInForm(Model model) {
        model.addAttribute("signInCommand", new SignInCommand());
        return "signinform";
    }

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String doSignIn(@Valid SignInCommand signInCommand, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "signinform";
        }
        return "signincomplete";
    }
}
