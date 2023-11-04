package com.siri_hate.mvc;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

    @RequestMapping("/")
    public String showMyView() {
        return "page";
    }

    @RequestMapping("/askDetails")
    public String askEmployeeDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "askEmployeeDetailsView";
    }

    @RequestMapping("/showDetails")
    public String showEmployeeDetails
            (
                    @Valid @ModelAttribute("employee") Employee employee,
                    BindingResult bindingResult
            ) {

        if (bindingResult.hasErrors()) {
            return "askEmployeeDetailsView";
        } else {
            return "showEmployeeDetailsView";
        }

    }

}
