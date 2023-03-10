package ua.pb.currency.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import ua.pb.currency.models.Transaction;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Component
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class TransactionsDao {
    private List<Transaction> transactions = tempInitialized();
    private static int ID_COUNT;

    public static List<Transaction> tempInitialized() {
        List<Transaction> transactions = new ArrayList<Transaction>();


        Calendar cal = Calendar.getInstance();

        Transaction eurBuy = new Transaction(++ID_COUNT, cal, LocalTime.now(), "buy", "EUR", 40.00000, 100, 4000);
        Transaction eurSell = new Transaction(++ID_COUNT, cal, LocalTime.now(), "sale", "EUR", 41.00000, 200, 8200);
        Transaction usdBuy = new Transaction(++ID_COUNT, cal, LocalTime.now(), "buy", "USD", 38.3, 300, 11490);
        Transaction usdSell = new Transaction(++ID_COUNT, cal, LocalTime.now(), "sale", "USD", 38.8, 400, 15520);

        transactions.add(eurBuy);
        transactions.add(eurSell);
        transactions.add(usdBuy);
        transactions.add(usdSell);

        return transactions;
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }

    public Transaction getTransactionById(int id) {
        return transactions.stream()
                .filter(t -> t.getId() == id)
                .findAny()
                .orElse(null);
    }

    public void save(Transaction newTransaction) {
        newTransaction.setId(++ID_COUNT);
        transactions.add(newTransaction);
    }
}
