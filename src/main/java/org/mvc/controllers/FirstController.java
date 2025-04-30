package org.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/first")
public class FirstController {

  @GetMapping("/hello")
  public String helloPage(@RequestParam(value = "name", required = false) String name,
      @RequestParam(value = "surname", required = false) String surname,
      Model model) {

    model.addAttribute("message", "Hello " + name + " " + surname);
    return "first/hello";
  }

  @GetMapping("/goodbye")
  public String goodbyePage() {
    return "first/goodbye";
  }

  @GetMapping("/calculator")
  public String calculatorPage(@RequestParam(value = "a") Integer a,
      @RequestParam(value = "b") Integer b,
      @RequestParam(value = "action") String action,
      Model model) {

    double result = 0.0;
    switch (action) {
      case "multiplication":
        result = a * b;
        break;
      case "division":
        result = a / b;
        break;
      case "addition":
        result = a + b;
        break;
      case "subtraction":
        result = a - b;
        break;
      default:
        result = 0.0;
        break;
    }
    model.addAttribute("result", result);
    return "first/calculator";
  }

}
