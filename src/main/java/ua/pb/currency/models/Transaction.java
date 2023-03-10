package ua.pb.currency.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalTime;
import java.util.Calendar;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Transaction {
    private int id;
    private Calendar date;
    private LocalTime time = LocalTime.now();
    private String operation;
    private String ccy;
    private double rate;
    private double inVal;
    private double inUAH;
}
