package com.example.session.controllers;

import com.example.session.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  private final LoggedUserManagementService loggedUserManagementService;

  public MainController(LoggedUserManagementService loggedUserManagementService) {
    this.loggedUserManagementService = loggedUserManagementService;
  }

  @GetMapping("/main")
  public String home(
//          We get the logout request parameter if present.
      @RequestParam(required = false) String logout,
//      a Model parameter to send the username to the view.
      Model model
  ) {
//    If the logout parameter is present, we erase the username from the LoggedUserManagementService bean.
    if (logout != null) {
      loggedUserManagementService.setUsername(null);
    }

//    We take the username value, which should be different than null if someone logged in.
    String username = loggedUserManagementService.getUsername();

    if (username == null) {
      return "redirect:/";
    }

//    We send the username to the view.
    model.addAttribute("username" , username);
    return "mainSession.html";
  }
}
