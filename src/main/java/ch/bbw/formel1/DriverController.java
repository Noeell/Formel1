package ch.bbw.formel1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class DriverController {

    @GetMapping("/driver")
    public String myGourmetForm(Model model) {

        model.addAttribute("driver", new Driver());
        return "driver";
    }

    @PostMapping("/driver")
    public String bmiSubmit(@Valid Driver driver, BindingResult bindingResult, Model model) {

        model.addAttribute("drivermodel", driver);

        if (bindingResult.hasErrors()) {
            return "driver";
        }
        return "response";
    }
}
