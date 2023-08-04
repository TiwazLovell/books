package com.example.session.controllers;

import com.example.session.model.LoginProcessor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

  private final LoginProcessor loginProcessor;

  public LoginController(LoginProcessor loginProcessor) {
    this.loginProcessor = loginProcessor;
  }

  @GetMapping("/")
  public String loginGet() {
    return "loginSession.html";
  }

  @PostMapping("/")
  public String loginPost(
      @RequestParam String username,
      @RequestParam String password,
      Model model
  ) {
    loginProcessor.setUsername(username);
    loginProcessor.setPassword(password);
    boolean loggedIn = loginProcessor.login();

//    When the user successfully authenticates, the app redirects them to the main page
    if (loggedIn) {
      return "redirect:/main";
    }

    model.addAttribute("message", "Login failed!");
    return "loginSession.html";
  }
}
