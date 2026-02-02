package com.streams.loggingtransaction;

import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
    public static void main(String[] args) {
        List<Integer> transactionIds = List.of(101, 102, 103);

        transactionIds.forEach(id ->
                System.out.println(LocalDateTime.now() + " - Transaction: " + id));
    }
}
