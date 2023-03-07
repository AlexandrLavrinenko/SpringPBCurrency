package ua.pb.currency.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class RatesDao {
    private String ccy;
    private String base_ccy;
    private double buy;
    private double sale;
}
