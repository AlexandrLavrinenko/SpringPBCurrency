package ua.pb.currency.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.pb.currency.dao.TransactionsDao;
import ua.pb.currency.models.Transaction;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/transactions")
public class TransactionsController {
    private final TransactionsDao transactionsDao;

    @Autowired
    public TransactionsController(TransactionsDao transactionsDao) {
        this.transactionsDao = transactionsDao;
    }

    @GetMapping()
    public String list(Model model) {
        model.addAttribute("list", transactionsDao.getAllTransactions());
        return "transactions/list";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable("id") int id, Model model) {
        model.addAttribute("find", transactionsDao.getTransactionById(id));
        return "transactions/find";
    }

    @GetMapping("/delete")
    public String delete(HttpServletRequest req) {
        String ccy = req.getParameter("ccy");
        String date = req.getParameter("date");

        System.out.println("ccy: " + ccy + ", date: " + date);

        return "transactions/delete";
    }

    @GetMapping("/new")
    public String createNewTransaction(Model model) {
        model.addAttribute("newTransaction", new Transaction());
        return "transactions/new";
    }

    @PostMapping()
    public String addNewTransaction(@ModelAttribute("newTransaction") Transaction transaction) {
        transactionsDao.save(transaction);
        return "redirect:/transactions";
    }

}
