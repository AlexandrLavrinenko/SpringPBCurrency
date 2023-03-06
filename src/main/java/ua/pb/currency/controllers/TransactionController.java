package ua.pb.currency.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/transactions")
public class TransactionController {

    @GetMapping("/find")
    public String search(@RequestParam(value = "ccy", required = false) String ccy,
                         @RequestParam(value = "date", required = false) String date,
                         Model model) {

        model.addAttribute("message", "Searching transactions with parameters: ccy=" + ccy + ", date=" + date);

        return "transactions/find";
    }

    @GetMapping("/delete")
    public String delete(HttpServletRequest req) {
        String ccy = req.getParameter("ccy");
        String date = req.getParameter("date");

        System.out.println("ccy: " + ccy + ", date: " + date);

        return "transactions/delete";
    }

    @GetMapping("/list")
    public String list() {
        return "transactions/list";
    }
}
