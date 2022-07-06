package ch.bbw.formel1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class DriverController {
    @Autowired
    private DriverService driverService;

    @GetMapping("/driver")
    public String driver(Model model) {

        model.addAttribute("driver", new Driver());
        return "driver";
    }

    @GetMapping("/driverstable")
    public String driversTable(Model model) {

        model.addAttribute("driverstable");
        return "driverstable";
    }

    @GetMapping("/home")
    public String home(Model model) {

        model.addAttribute("home");
        return "home";
    }

    @PostMapping("/driver")
    public String bmiSubmit(@Valid Driver driver, BindingResult bindingResult, Model model) {

        model.addAttribute("drivermodelx", driver);

        if (bindingResult.hasErrors()) {
            return "driver";
        }
        driverService.addDriver(driver);
        return "driverstable";
    }

    @ModelAttribute("allDrivers")
    public List<Driver> allDrivers() {
        return driverService.getAllDrivers();
    }
}
