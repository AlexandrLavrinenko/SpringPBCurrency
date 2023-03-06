package ua.pb.currency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RatesController {

    public static final String URL_JSON = "https://api.privatbank.ua/p24api/pubinfo?json&exchange&coursid=5";
    public static final String URL_XML = "https://api.privatbank.ua/p24api/pubinfo?exchange&coursid=5";

    @GetMapping("/rates")
    public String getRate() {
        return "rates";
    }
}
