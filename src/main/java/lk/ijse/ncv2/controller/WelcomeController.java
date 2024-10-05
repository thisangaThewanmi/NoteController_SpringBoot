package lk.ijse.ncv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//harima mvc ekak nm harinm metnin veiw ekak yanna ona .
@RequestMapping("api/v1/welcome")
public class WelcomeController {

    @GetMapping
    public String veiwWelcomeScreen(Model model) {
        model.addAttribute("welcomeMessage", "Welcome");
        return "welcome";
    }
}
