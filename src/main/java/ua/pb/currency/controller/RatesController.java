package ua.pb.currency.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RatesController {

    @GetMapping("/rates")
    public String getRate() {
        return "rates";
    }
}
