package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {

    @RequestMapping("/main")
    public String main(@RequestParam String usd, Model model){
        if (usd.isEmpty()) usd="0.0";

        Double usdDouble = Double.parseDouble(usd);
        Double vnd = usdDouble*23000;

        model.addAttribute("vnd", vnd);
//
        return "convert";
    }


}